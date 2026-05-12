import java.util.Comparator;

public class StudentPriority implements Comparator<Student> {

    @Override
    public int compare(Student o1, Student o2) {
        if(o1.getStudentType().equals(o2.getStudentType())){
            return Integer.compare(o1.getArrivalTimeAtAdvisingCenter(), o2.getArrivalTimeAtAdvisingCenter());
        }else{
            return o1.compareTo(o2);
        }
    }
}
