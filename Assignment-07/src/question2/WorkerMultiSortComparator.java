package question2;

import java.util.Comparator;

public class WorkerMultiSortComparator implements Comparator<Worker> {

    @Override
    public int compare(Worker o1, Worker o2) {
        int jobCompare = o1.getJobTitle().compareTo(o2.getJobTitle());
        // If the jobTitles are alpha numerically equal
        if (jobCompare == 0){
            // If the lengths of the workers names are the same
            int nameLengthCompare = o1.getName().length() - o2.getName().length();
            if (nameLengthCompare == 0){
                //Return the difference between the first workers id and second workers id
                return o1.getId() - o2.getId();
            }
            else{
                //the order should be based on the length of the name of the worker, with a negative returned
                //for the shortest name, 0 if equal, or positive if longer
                return nameLengthCompare;
            }

        }
        else{
            //order based on the alphabetical ordering by job title.
            return jobCompare;
        }
    }
}
