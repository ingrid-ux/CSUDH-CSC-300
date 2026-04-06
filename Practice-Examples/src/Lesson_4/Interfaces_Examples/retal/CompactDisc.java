package Lesson_4.Interfaces_Examples.retal;

/**
   Compact Disc class
*/

public class CompactDisc implements RetailItem
{
   private String title;       // The CD's title
   private String artist;      // The CD's artist
   private double retailPrice; // The CD's retail price

   public CompactDisc(String cdTitle, String cdArtist, double cdPrice)
   {
      setTitle(cdTitle);
      setArtist(cdArtist);
      setRetailPrice(cdPrice);
   }
   
   public void setTitle(String titleX)
   {
      title = titleX;
   }

   public void setArtist(String cdArtist)
   {
      artist = cdArtist;
   }

   public void setRetailPrice(double cdPrice)
   {
      retailPrice = cdPrice;
   }

   public String getTitle()
   {
      return title;
   }
   

   public String getArtist()
   {
      return artist;
   }

   public double getRetailPrice()
   {
      return retailPrice;
   }
}