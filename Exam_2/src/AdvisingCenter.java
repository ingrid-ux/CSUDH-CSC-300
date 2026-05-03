import java.util.ArrayList;
import java.util.PriorityQueue;
import java.util.Random;

public class AdvisingCenter {
        private Random randy;
        private PriorityQueue<Student> waitingQ;
        private ArrayList<Student> processedStudents;
        private Advisor[] advisors;
        private String deptName;
        private int currentTime = 0;

        public AdvisingCenter(String name, int seed, int numAdvisors){
            this.deptName = name;
            waitingQ = new PriorityQueue<>(new StudentPriority());
            randy = new Random(seed);
            createAdvisors(numAdvisors);
        }

        public void createAdvisors(int numAdvisors){
            advisors = new Advisor[numAdvisors];
            for (int i = 0; i < advisors.length; i++){
                advisors[i] = new Advisor();
            }
        }

        public void openAdvisingCenter(){
            for (currentTime = 0; currentTime < 10; currentTime++){
                int randyNum = randy.nextInt(1,31);
                if (randyNum < 5){
                    waitingQ.add(new Senior(currentTime, new FullTimeAdvising()));
                }
                else if(randyNum < 6)
            }
        }


}
