package Lesson_4.amusement_park;
/*
import java.util.Random;
import java.util.ArrayList;
import java.io.PrintWriter;
import java.io.IOException;
public class AmusementPark
{
	private String parkName;
	private int numAttractions;
	private ArrayList<Attraction> alAttraction = new ArrayList<>();
	public AmusementPark()
	{
		setParkName("");
	}
	public AmusementPark(String name, int numAttracts)
	{
		setParkName(name);
		setNumAttractions(numAttracts);
		createAttractions(numAttractions);
	}
	public void setParkName(String name)
	{
		parkName = name;
	}
	public String getParkName()
	{
		return parkName;
	}
	public void setNumAttractions(int numAttracts)
	{
		numAttractions = numAttracts;
	}
	public int getNumAttractions()
	{
		return numAttractions;
	}
	
	public void createAttractions(int newAttractions)
	{
		Random randy = new Random(9);
		for (int i=0; i < newAttractions; i++)
		{
			int ratePerMinute = randy.nextInt(25, 45);
			Attraction newAttract = new Attraction(ratePerMinute);
			alAttraction.add(newAttract);
		}
	}	
	
	public void runThePark(int minutesSimulated)
	{
		//Initialize Queues
		
		Attraction tempAttraction;
		NormalRider tempNormalRider;
		FastRider tempFastRider;
		Random randyX = new Random(6);
		int initialRiders = 34*randyX.nextInt(5,15);
		for(int j=0; j < initialRiders; j++)
		{
			tempAttraction = alAttraction.get(randyX.nextInt(0, numAttractions));
			if(j%7 < 3)
			{
				tempFastRider = new FastRider(0);
				tempAttraction.addRiderFastLine(tempFastRider);
			}
			else
			{
				tempNormalRider = new NormalRider(0);
				tempAttraction.addRiderNormalLine(tempNormalRider);
			}
		}
		
		//Run through the simulation adding and processing riders
		int newRiders;
		
		for(int i = 1; i <= minutesSimulated; i++)
		{

			newRiders = 49*randyX.nextInt(5,15);
			for(int j=0; j < newRiders; j++)
			{
				tempAttraction = alAttraction.get(randyX.nextInt(0, numAttractions));
				if(j%7 < 3)
				{
					tempFastRider = new FastRider(i);
					tempAttraction.addRiderFastLine(tempFastRider);
				}
				else
				{
					tempNormalRider = new NormalRider(i);
					tempAttraction.addRiderNormalLine(tempNormalRider);
				}
			}
			//Now remove from each Attraction an equal number if even or one 
			int toBeProcessed;
			for(Attraction attraction: alAttraction)
			{
				toBeProcessed = attraction.getRatePerMinute();
				while(toBeProcessed > 0 &&((attraction.getAlFastLineSize() !=0) || (attraction.getAlNormalLineSize() !=0)))
				{
					//Remove from fast list
					
					if(attraction.getAlFastLineSize() !=0 && (toBeProcessed%3 != 0 || attraction.getAlNormalLineSize() ==0))
					{
						tempFastRider = attraction.removeRiderFastLine();
						tempFastRider.setEndOnLineTime(i);
						attraction.addGotOnRide(tempFastRider);
						toBeProcessed = toBeProcessed-1;
					}
					else if (attraction.getAlNormalLineSize() !=0)
					{
						tempNormalRider = attraction.removeRiderNormalLine();
						tempNormalRider.setEndOnLineTime(i);
						attraction.addGotOnRide(tempNormalRider);
						toBeProcessed = toBeProcessed-1;
					}
				}
			}
		}
	}
					
	public void printParkStatistics(PrintWriter outputWriter) throws IOException
	{
		outputWriter.printf("The Statistics for %S\n\n", parkName);
		outputWriter.printf("The Total Gate for Fast Riders is %,.2f\n", FastRider.totalGate);
		outputWriter.printf("The Total Gate for Normal Riders is %,.2f\n\n", NormalRider.totalGate);
		
		for(Attraction attract: alAttraction)
		{
			outputWriter.printf("The Number Of Fast Riders Still On Line For %s is %,d\n", attract.getAttractionID(), attract.getAlFastLineSize());
			outputWriter.printf("The Number Of Normal Riders Still On Line For %s is %,d\n", attract.getAttractionID(), attract.getAlNormalLineSize());
		}
		outputWriter.printf("\n");	
		outputWriter.printf("%10s %7s %11s %11s %11s %9s %10s\n", "ATTRACTION", "FAST","FAST", "NORMAL", "NORMAL", "TOTAL", "TOTAL");
		outputWriter.printf("%19s %12s %9s %11s %9s %11s\n", "RIDERS","WAIT AVG", "RIDERS", "WAIT AVG", "RIDERS", "WAIT AVG"); 
		
		
		
		
		for(Attraction attract: alAttraction)
		{
			int numGotOn = attract.getAlGotOnRideSize();
			Rider tempRider;
			int totalFastRiders = 0;
			int totalTimeFastRiders = 0;
			int totalNormalRiders = 0;
			int totalTimeNormalRiders = 0;
			for(int i = 0; i < numGotOn; i++)
			{
				tempRider = attract.getGotOnRide(i);
				if(tempRider instanceof FastRider)
				{
					totalFastRiders++;
					totalTimeFastRiders = totalTimeFastRiders +tempRider.getTimeOnLine();
				}
				else
				{
					totalNormalRiders++;
					totalTimeNormalRiders = totalTimeNormalRiders +tempRider.getTimeOnLine();
				}
			}
			
			double averageFastRiders = (double)(totalTimeFastRiders)/totalFastRiders;
			double averageNormalRiders = (double)(totalTimeNormalRiders)/totalNormalRiders;
			double averageAllRiders = (double)(totalTimeFastRiders+totalTimeNormalRiders)/numGotOn;
			outputWriter.printf("%7s %9d %13.2f %9d %11.2f %9s %11.2f\n", attract.getAttractionID(), totalFastRiders, averageFastRiders, totalNormalRiders, averageNormalRiders, numGotOn, averageAllRiders);
		}				
	}
}
 */