package question1;

public class EmployeeZ implements Comparable<EmployeeZ> {

    private String firstName;
    private double salary;

    EmployeeZ(String firstName, double salary){
        this.firstName = firstName;
        this.salary = salary;
    }
    // Mutators + Accessors
    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    // CompareTo Method : highest salary
    @Override
    public int compareTo(EmployeeZ other) {
        if(Math.abs(this.salary - other.salary) < 0.01){
            return 0;
        }
        if(this.salary > other.salary){
            return -1;
        }else{
            return 1;
        }
    }
}
