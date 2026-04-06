package Lesson_4.Interfaces_Examples.retal;

/**
   DVDMovie class
*/

public class DVDMovie implements RetailItem
{
   private String title;       // The DVD's title
   private int runningTime;    // Running time in minutes
   private double retailPrice; // The DVD's retail price

   public DVDMovie(String dvdTitle, int runTime, double dvdPrice)
   {
      setTitle(dvdTitle);
      setRunningTime(runTime);
      setRetailPrice(dvdPrice);
   }
   
   public void setTitle(String titleX)
   {
      title = titleX;
   }

   public void setRunningTime(int runTime)
   {
      runningTime = runTime;
   }

   public void setRetailPrice(double dvdPrice)
   {
      retailPrice = dvdPrice;
   }
   
   public String getTitle()
   {
      return title;
   }

   public int getRunningTime()
   {
      return runningTime;
   }

   public double getRetailPrice()
   {
      return retailPrice;
   }
}