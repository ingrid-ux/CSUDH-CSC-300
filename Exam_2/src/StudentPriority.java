import java.util.Comparator;

public class StudentPriority implements Comparator<Student> {

    @Override
    public int compare(Student o1, Student o2) {
        if(o1.getStudentType().compareTo(o2.getStudentType()) == 0){
            return Integer.compare(o1.getArrivalTimeAtAdvisingCenter(),
                    o2.getArrivalTimeAtAdvisingCenter());
        }else{
            return o1.getStudentType().compareTo(o2.getStudentType());
        }
    }
}
