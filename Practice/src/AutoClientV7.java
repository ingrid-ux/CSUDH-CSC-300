/* Auto Client, version 7
   Anderson, Franceschi Modified by Rosenthal
*/

public class AutoClientV7
{
   public static void main( String [] args )
   {
      System.out.printf( "Before instantiating an Auto object:"
                          + "\nthe count of Auto objects is %d\n",
                          + AutoV7.getCountAutos( ) );

      AutoV7 sporty = new AutoV7( "Spyder", 0, 0.0 );

      System.out.printf( "\nAfter instantiating an Auto object:"
                          + "\nthe count of Auto objects is %d\n",
                          + AutoV7.getCountAutos( ) );
      System.out.printf(sporty.toString());
   }


}
