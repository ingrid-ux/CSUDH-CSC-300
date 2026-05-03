public class Freshman extends Student{
    private String studentID;

    Freshman(int arrivalTime, AdvisingType advT){
        super(arrivalTime);
        setStudentType("Freshman");
        setAdvisingType(advT);
        setStudentID();

    }


    @Override
    public void setStudentID() {
        idCounter++;
        studentID = "CSUDH " + getStudentType() + " " + Student.idCounter;
    }

    @Override
    public String getStudentID() {
        return this.studentID;
    }

    @Override
    public int compareTo(Student other) {
        return other.getStudentType().compareTo(this.getStudentType());
    }
}
