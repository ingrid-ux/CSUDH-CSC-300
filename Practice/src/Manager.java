import java.util.ArrayList;
public class Manager extends Employee
{
	private ArrayList<Employee> managedEmployees = new ArrayList<Employee>();
	public Manager(String name, String title, int ID, int age, double salary)
	{
		super(name, title, ID, age, salary);
	}
	public void addManagedEmployee(Employee emp)
	{
		managedEmployees.add(emp);
	}
	public int getManagedEmployeesListSize()
	{
		return managedEmployees.size();
	}
	public Employee getManagedEmployeeAtIndex(int index)
	{
		return managedEmployees.get(index);
	}
	public String toString()
	{
		String str = String.format("The manager name and title are %s %s\n", getName(), getTitle());
		str = str + String.format("The manager ID is %d  The manager age is %d\n", getID(), getAge());
		str = str + String.format("The manager salary is %.2f\n", getSalary());
		return str;
	}
}