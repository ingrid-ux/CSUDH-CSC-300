package question3;

public class Printer {
    private Job printJob; //This instance variable is either null or refers to the current Job being processed by the printer.
    private String printerName;

    private int startIdleTime;
    private int startInUseTime;
    private int totalIdleTime;
    private int totalInUseTime;
    private int totalJobsProcessed;

    public Printer(){}
    public Printer(String printerName){
        setPrinterName(printerName);
    }

    public void setPrinterName(String printerName) {
        this.printerName = printerName;
    }

    public String getPrinterName() {
        return printerName;
    }

    public void setJob(Job printJob) {
        this.printJob = printJob;
    }
    public Job getJob() {
        return printJob;
    }

    public void setStartInUseTime(int time) {
        totalIdleTime += (time - startIdleTime); //
        this.startInUseTime = time;
        totalJobsProcessed++;
    }
    public void setStartIdleTime(int time){
        this.startIdleTime = time;
        totalInUseTime += (time - startInUseTime);
    }
    public int getTotalIdleTime(int currentTime){
        return totalIdleTime + (currentTime - startIdleTime);
    }
    public int getTotalInUseTime(){
        return totalInUseTime;
    }
    public int getTotalJobsProcessed(){
        return totalJobsProcessed;
    }
}
