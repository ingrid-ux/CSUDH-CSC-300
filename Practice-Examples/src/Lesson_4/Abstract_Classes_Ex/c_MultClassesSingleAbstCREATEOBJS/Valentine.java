package Lesson_4.Abstract_Classes_Ex.c_MultClassesSingleAbstCREATEOBJS;

class Valentine extends Card
{
  private int kisses;

  public Valentine (String recep, int numK )
  {
    setRecipent(recep);//from Card
    setKisses(numK);
  }
  public void setKisses(int numK)
  {
  	  kisses = numK;
  }
  public int getKisses()
  {
  	  return kisses;
  }

  public void greeting()  
  { 	  
  	System.out.printf("Dear %s,\n", getRecipent());
    System.out.printf("Love and Kisses,");
    for ( int j=0; j < getKisses(); j++ )
      System.out.printf("X");
    System.out.printf("\n\n");
  }
}