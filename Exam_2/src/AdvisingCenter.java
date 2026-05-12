import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Iterator;
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
            processedStudents = new ArrayList<>();
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
            for (currentTime = 0; currentTime < 10; currentTime++) {
                for (int i = 0; i < 10; i++) {
                    int randyNum = randy.nextInt(1, 31);
                    if (randyNum < 5) {
                        waitingQ.add(new Senior(currentTime, new FullTimeAdvising()));
                    } else if (randyNum < 6) {
                        waitingQ.add(new Senior(currentTime, new PartTimeAdvising()));
                    } else if (randyNum < 14) {
                        waitingQ.add(new JuniorSoph(currentTime, new FullTimeAdvising()));
                    } else if (randyNum < 16) {
                        waitingQ.add(new JuniorSoph(currentTime, new PartTimeAdvising()));
                    }
                    else if (randyNum < 29) {
                        waitingQ.add(new Freshman(currentTime, new FullTimeAdvising()));
                    } else {
                        waitingQ.add(new Freshman(currentTime, new PartTimeAdvising()));
                    }
                }
            }
        }

        public void operateAdvisingCenter(int durationForArriving){
            int endArrivalsTime = currentTime + durationForArriving;
            Student tempStudent;

            while(processedStudents.size() != Student.idCounter || currentTime < endArrivalsTime) {
                if (currentTime < endArrivalsTime) {
                    for (int i = 0; i < 8; i++) {
                        int randyNum = randy.nextInt(1, 31);
                        if (randyNum < 6) {
                            waitingQ.add(new Senior(currentTime, new FullTimeAdvising()));
                        } else if (randyNum < 7) {
                            waitingQ.add(new Senior(currentTime, new PartTimeAdvising()));
                        } else if (randyNum < 15) {
                            waitingQ.add(new JuniorSoph(currentTime, new FullTimeAdvising()));
                        } else if (randyNum < 18) {
                            waitingQ.add(new JuniorSoph(currentTime, new PartTimeAdvising()));
                        }
                        else if (randyNum < 29) {
                            waitingQ.add(new Freshman(currentTime, new FullTimeAdvising()));
                        } else {
                            waitingQ.add(new Freshman(currentTime, new PartTimeAdvising()));
                        }
                    }

                }


                for (Advisor advisor : advisors) {
                    if (!advisor.getIsFree()) {
                        advisor.decrementTimeRemainingForMeeting();
                        if (advisor.getTimeRemainingForMeeting() == 0) {
                            tempStudent = advisor.removeAssignedStudent();
                            processedStudents.add(tempStudent);
                            tempStudent.setTotalTimeAtAdvisingCenter(currentTime);
                        }
                    }

                }

                for (Advisor advisor: advisors){
                    if (advisor.getIsFree() && !waitingQ.isEmpty()){
                        tempStudent = waitingQ.remove();
                        tempStudent.setAdvisorStartTime(currentTime);
                        advisor.setAssignedStudent(tempStudent);
                        int meetingDuration = randy.nextInt(10,21);
                        tempStudent.setMeetingDuration(meetingDuration);
                        advisor.setTimeRemainingForMeeting(meetingDuration);
                    }
                }

                currentTime++;
            }// end of while loop

        }

        public void generateAdvisingCenterResults(String outputFile) throws IOException {
            PrintWriter out = new PrintWriter(outputFile);
            out.printf("Data For CSUDH Advising Center For %s Department%n%n", deptName);

            out.printf("Summary Data%n");
            for(Advisor advisor: advisors){
                out.printf("%s", advisor);
            }

            double studentTotalTime = 0;
            int studentCount = 0;

            double seniorTotalTime = 0;
            int seniorCount = 0;

            double juniorSophTotalTime = 0;
            int juniorSophCount = 0;

            double freshmenTotalTime = 0;
            int freshmenCount = 0;

            for (Student student: processedStudents){
                int totalTime = student.getTotalTimeAtAdvisingCenter();

                studentTotalTime += totalTime;
                studentCount++;

                if(student instanceof Senior){
                    seniorTotalTime += totalTime;
                    seniorCount++;
                } else if(student instanceof JuniorSoph){
                    juniorSophTotalTime += totalTime;
                    juniorSophCount++;
                } else if(student instanceof Freshman){
                    freshmenTotalTime += totalTime;
                    freshmenCount++;
                }
            }

            out.printf("%nThe average total time in meeting per students for %d Seniors is %.2f minutes%n", seniorCount, seniorCount == 0 ? 0 : seniorTotalTime / seniorCount);
            out.printf("The average total time in office per student for %d JuniorSophs is %.2f minutes%n", juniorSophCount, juniorSophCount == 0 ? 0 : juniorSophTotalTime / juniorSophCount);
            out.printf("The average total time in office per student for %d Freshmen is %.2f minutes%n", freshmenCount, freshmenCount == 0 ? 0 : freshmenTotalTime / freshmenCount);
            out.printf("The average total time in office per student for %d Students is %.2f minutes%n%n", studentCount, studentCount == 0 ? 0 : studentTotalTime/ studentCount);

            out.printf("%-25s %-20s %-20s %-18s %-12s %-10s %-13s %-10s%n",
                    "STUDENT ID",
                    "STUDENT TYPE",
                    "ADVISING TYPE",
                    "ADVISING NUMBER",
                    "ARRIVAL TIME",
                    "WAIT TIME",
                    "MEETING TIME",
                    "TOTAL TIME");
            Iterator<Student> it = processedStudents.iterator();

            while(it.hasNext()){
                Student s = it.next();
                out.printf("%-25s %-20s %-20s %-18s %-12d %-10d %-13d %-10d%n",
                        s.getStudentID(),
                        s.getStudentType(),
                        s.getAdvisingType().getAdvisingType(),
                        s.getAdvisingType().getAdvisingNumber(),
                        s.getArrivalTimeAtAdvisingCenter(),
                        s.getWaitTime(),
                        s.getMeetingDuration(),
                        s.getTotalTimeAtAdvisingCenter()
                );
            }

            out.close();

        } // end


}
