abstract class Student implements Comparable<Student>{
    public static int idCounter = 0;

    private int arrivalTimeAtAdvisingCenter;
    private int advisorStartTime;
    private int waitTime;
    private int meetingDuration;
    private int totalTimeAtAdvisingCenter;
    private AdvisingType advType;
    private String studentType;

    // abstract methods

    public abstract void setStudentID();
    public abstract String getStudentID();
    @Override
    public abstract int compareTo(Student other);



    // Mutators

    public Student(int arrivalTime){
        setArrivalTimeAtAdvisingCenter(arrivalTime);
    }

    public void setArrivalTimeAtAdvisingCenter(int arrivalTimeAtAdvisingCenter) {
        this.arrivalTimeAtAdvisingCenter = arrivalTimeAtAdvisingCenter;
    }

    public void setAdvisorStartTime(int advisorStartTime) {
        this.advisorStartTime = advisorStartTime;
        this.waitTime = advisorStartTime - arrivalTimeAtAdvisingCenter;
    }


    public void setMeetingDuration(int meetingDuration) {
        this.meetingDuration = meetingDuration;
    }

    public void setTotalTimeAtAdvisingCenter(int endTime) {
        this.totalTimeAtAdvisingCenter = endTime - arrivalTimeAtAdvisingCenter;
    }

    public void setAdvisingType(AdvisingType advType) {
        this.advType = advType;
    }

    public void setStudentType(String studentType) {
        this.studentType = studentType;
    }

    // Accessors

    public int getArrivalTimeAtAdvisingCenter() {
        return arrivalTimeAtAdvisingCenter;
    }

    public int getAdvisorStartTime() {
        return advisorStartTime;
    }

    public int getWaitTime() {
        return waitTime;
    }

    public int getMeetingDuration() {
        return meetingDuration;
    }

    public int getTotalTimeAtAdvisingCenter() {
        return totalTimeAtAdvisingCenter;
    }

    public AdvisingType getAdvisingType() {
        return advType;
    }

    public String getStudentType() {
        return studentType;
    }
}
