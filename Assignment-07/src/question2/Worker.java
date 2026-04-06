package question2;

public class Worker implements Comparable<Worker>{
    private int id;
    private String name;
    private Integer salary;
    private String jobTitle;

    Worker(int id, String name, Integer salary, String jobTitle){
        this.id = id;
        this.name = name;
        this.salary = salary;
        this.jobTitle = jobTitle;
    }
    // getter functions
    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public Integer getSalary() {
        return salary;
    }

    public String getJobTitle() {
        return jobTitle;
    }

    // setter functions

    public void setId(int id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setSalary(Integer salary) {
        this.salary = salary;
    }

    public void setJobTitle(String jobTitle) {
        this.jobTitle = jobTitle;
    }

    @Override
    public int compareTo(Worker o1) {
        return this.salary.compareTo(o1.salary);
    }

    @Override
    public String toString(){
        return String.format("ID: %d Name: %s" +
                " Salary: $%d Job Title: %s%n",id,name,salary,jobTitle);
    }
}
