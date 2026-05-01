package question5;

import java.util.*;
import java.io.*;

public class PostfixEvaluator {

    public static int evaluatePostfixExpression(StringBuilder exp){
        Stack<Integer> intStack = new Stack<>();
        exp.append(" )");

        int i = 0;

        while(exp.charAt(i) != ')' ){
            char ch = exp.charAt(i);
            if (ch == ' ') {
                i++;
                continue;
            }
            if(Character.isDigit(ch)){
                intStack.push(ch-'0');
                printStack(intStack);
            }
            else{ // if the current char is an operator
                int popVal2 = intStack.pop();
                int popVal1 = intStack.pop();
                printStack(intStack);
                int result = calculate(popVal1, popVal2, ch);
                intStack.push(result);
                printStack(intStack);

            }
            i++;
        }
        return intStack.pop();
    }

    public static int calculate(int op1, int op2, char oper) {
        switch (oper) {
            case '+':
                return op1 + op2;
            case '-':
                return op1 - op2;
            case '*':
                return op1 * op2;
            case '/':
                return op1 / op2;
            case '^':
                return (int) Math.pow(op1, op2);
            case '%':
                return op1 % op2;
            default:
                return 0;
        }
    }

    public static void printStack(Stack<Integer> stack) {
        for (Integer val : stack) {
            System.out.printf("%d%n", val);
        }
    }
    public static void main(String[] args) throws IOException {
        Scanner input = new Scanner(System.in);
        System.out.printf("Please enter name of the file to read postfix expressions from: ");
        String inputFileName = input.next();
        File inputFile = new File(inputFileName);

        if(!inputFile.exists()){
            System.out.printf("Error: %s not found.\n", inputFileName);
            System.exit(0);
        }

        Scanner inputReader = new Scanner(inputFile);

        while(inputReader.hasNextLine()){
            String line = inputReader.nextLine();
            StringBuilder exp = new StringBuilder(line);

            System.out.printf("The original postfix expression is: %s%n", exp);

            int result = evaluatePostfixExpression(exp);

            System.out.printf("The value of the expression is %d%n%n", result);
        }

        inputReader.close();
        input.close();

    }



}
