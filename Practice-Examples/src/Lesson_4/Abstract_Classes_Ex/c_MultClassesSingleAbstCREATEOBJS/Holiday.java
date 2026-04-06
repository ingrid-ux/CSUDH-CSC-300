package Lesson_4.Abstract_Classes_Ex.c_MultClassesSingleAbstCREATEOBJS;
/*
 * Holiday is not an abstract class
 * *
 * Even though it has an abstract parent, a Holiday object is just as much an object as any other.
 *
 */

class Holiday extends Card
{


  public Holiday(String recep )
  {
    setRecipent(recep); //from Card; remember super() inserted in first line
  }

    /*
     * its constructor calls the no-argument constructor in its parent, Card,
     * which calls the no-argument constructor in Object
     */


    public void greeting()
  {
    System.out.printf("Dear %s,\n", getRecipent());
    System.out.printf("Season's Greetings!\n\n");
  }
  /*
   * Notes:
        * * - Holiday inherits the public abstract method greeting() from its parent
        * * - Holiday or any other class directly extending Card must define
        * * a greeting() method that includes a method body (statements between braces)
        * *
        * *
        * * The definition of greeting() must match the signature given in the parent.
        * *
        * * INTERESTING NOTE TO REMEMBER:
        * * If Holiday did not define greeting(),
        * * then Holiday must be declared to be an ABSTRACT CLASS
        * *
        * * This would make it an abstract child of an abstract parent
        * * (This is allowed, but then Holiday couldn't be instantiated)
        * *
        * *

   */
}