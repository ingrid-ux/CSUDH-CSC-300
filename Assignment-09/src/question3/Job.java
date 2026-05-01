package question3;

public class Job implements Comparable<Job> {
    private int id;
    private int arrivalTime;
    private int timeForJob;
    private int priority;
    private int startTime; //fpr job
    private int waitTime; //in queue
    private int endTime; //for job

    private static int idCounter = 1;
    // A Job has a default constructor that does nothing.
    public Job(){}

    public Job(int arrivalTime, int timeForJob, int priority){
        setID();
        setArrivalTime(arrivalTime);
        setTimeForJob(timeForJob);
        setPriority(priority);
    }

    public void setID() {
        this.id = idCounter;
        idCounter++;
    }
    public int getID() {
        return id;
    }

    public void setArrivalTime(int arrivalTime) {
        this.arrivalTime = arrivalTime;
    }

    public int getArrivalTime() {
        return arrivalTime;
    }

    public void setTimeForJob(int timeForJob) {
        this.timeForJob = timeForJob;
    }

    public int getTimeForJob() {
        return timeForJob;
    }

    public void setPriority(int priority) {
        this.priority = priority;
    }

    public int getPriority() {
        return priority;
    }

    public void setStartTime(int startTime) {
        this.startTime = startTime;
        this.waitTime = startTime - arrivalTime;
    }

    public int getStartTime() {
        return startTime;
    }

    public int getEndTime() {
        return endTime;
    }

    public void setEndTime(int endTime) {
        this.endTime = endTime;
    }

    public int getWaitTime() {
        return waitTime;
    }

    @Override
    public int compareTo(Job o) {
        return Integer.compare(this.priority, o.priority);
    }
}

