package Lesson_4.Abstract_Classes_Ex.c_MultClassesSingleAbstCREATEOBJS;

abstract class Card
{
  private String recipient; 
  public abstract void greeting();// An abstract method
    /*
    ** ABSTRACT METHOD - greeting()
    * any other class directly extending Card, MUST DEFINE a greeting() method
    * *  that INCLUDES A METHOD BODY (statements between braces).
    * *
    * * The definition of greeting() MUST MATCH the signature given in the parent.


    ** ABSTRACT METHODS
    * *
    * *    accessModifier abstract returnType methodName( argument list );

     * * - Abstract method has no body.
    * * - Declares an access modifier, return type, and method signature
    * *   followed by a semicolon (no braces)
    * * if there are braces {} IT IS NOT ABSTRACT, just an empty body
    * *  - MUST BE PUBLIC OR INHERITED - a private abstract method makes no sense
    * *  - NO STATEMENTS
    * *  - a non-abstract child (Holiday) inherits the abstract method (greeting())
    * *    and must define a non-abstract method (greeting() in Holiday)
    * *    that matches the abstract method (greeting() in Card)
    * *  - Abstract classes can (don't have to) contain abstract methods.
    * *  - abstract class can contain non-abstract methods - except PRIVATE ONES
    * *    which will be inherited by the children (ex. setRecipient())
     */
  public void setRecipent(String recep)
  {
  	  recipient = recep;
  }
  public String getRecipent()
  {
  	  return recipient;
  }
}
    /*
    * POG
    * See Card.java, Holiday.java, Valentine.java, Birthday.java
    * and CardTesterV3.java to demonstrate how you can create
    * multiple classes from a single abstraction, and then create
    * objects from any of those classes

     */