package Lesson_4.Abstract_Classes_Ex.c_MultClassesSingleAbstCREATEOBJS;

import java.util.Scanner;
public class CardTesterV3
{
  public static void main ( String[] args )
  {
    String me;
    Scanner keyboard = new Scanner( System.in );
    System.out.printf("Recipient's name: ");
    me = keyboard.next();

    Holiday hol = new Holiday( me );
    hol.greeting();

    Birthday  bd  = new Birthday( me, 21 );
    bd.greeting();

    Valentine val = new Valentine( me, 7 );
    val.greeting();

  }
}