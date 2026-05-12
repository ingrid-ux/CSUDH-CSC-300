public class JuniorSoph extends Student {

    private String studentID;
    JuniorSoph(int arrivalTime, AdvisingType advT){
        super(arrivalTime);
        setStudentType("JuniorSoph ");
        setAdvisingType(advT);
        setStudentID();
    }

    @Override
    public void setStudentID() {
        idCounter++;
        studentID = "CSUDH " + getStudentType() + Student.idCounter;
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
