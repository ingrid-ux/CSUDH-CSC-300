package question4;
import java.io.File;
import java.util.*;
import java.io.*;

public class InfixToPostfixConverter {
    public static void main(String[] args) throws IOException{
        Scanner keyboard = new Scanner(System.in);
        System.out.printf("Please enter name of the file to read infix expressions from: ");
        String inputFileName = keyboard.next();
        File inputFile = new File(inputFileName);

        if(!inputFile.exists()){
            System.out.printf("Error: %s not found.\n", inputFileName);
            System.exit(0);
        }

        Scanner inputReader = new Scanner(inputFile);

        while(inputReader.hasNextLine()){
            String infix = inputReader.nextLine();
            System.out.printf("The original infix expression is: %s%n", infix);

            String postfix = convertToPostfix(infix);
            System.out.printf("The expression in postfix notation is: %s%n", postfix);
            System.out.printf("%n");
        }

        inputReader.close();
    }

    public static String convertToPostfix(String infix){
        // Create a new empty Stack of type Character called charStack
        Stack<Character> charStack = new Stack<>();
        // Create an empty String or StringBuilder called postfixExpression
        StringBuilder postfixExpression = new StringBuilder();
        // Push a left parenthesis ' (' onto charStack.
        charStack.push('(');
        // Append a right parenthesis ') ' to the end of infix.
        infix += ")";

        for (int infixCount = 0; !charStack.isEmpty(); ++infixCount) {
            char curr = infix.charAt(infixCount);
            if(Character.isDigit(curr)){
                // Append the character to postfixExpression and then append a space “ ”
                postfixExpression.append(curr).append(" ");
            }
            // else if the current character in infix is a left parenthesis,
            // Push it onto the charStack.
            else if(curr == '('){
                charStack.push(curr);
            }
            // else if the current character in infix is an operator (use the isOperator(char) method)
            else if (isOperator(curr)){
                // While the Character at the top of the stack (use peek on the Stack) is an operator (use
                // isOperator(char) and has an equal or higher precedence than the current operator (the
                // current character) (use precedence method)

                while (isOperator(charStack.peek()) && precedence(curr, charStack.peek())){
                    // Append the popped operator to postfixExpression and then append a space “ ”
                    postfixExpression.append(charStack.pop()).append(" ");
                }
                // Push the current character in infix onto the stack.
                charStack.push(curr);
            }

            else if(curr == ')'){
                while (charStack.peek() != '('){
                    postfixExpression.append(charStack.pop()).append(" ");
                }
                charStack.pop();
            }
        }

        return postfixExpression.toString();

    }

    public static boolean isOperator(char c){
        return (c == '+' || c == '-' || c == '*' || c == '/' || c == '^' || c == '%');
    }

    public static boolean precedence(char operator1, char operator2){
        if (operator1 == '^')
            return false;
        else if (operator2 == '^')
            return true;
        else if (operator1 == '*' || operator1 == '/' || operator1 == '%')
            return false;
        else if (operator2 == '*' || operator2 == '/' || operator2 == '%')
            return true;
        else
            return false;

    }
}
