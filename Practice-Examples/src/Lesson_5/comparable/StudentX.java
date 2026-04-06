package Lesson_5.comparable;

class StudentX implements Comparable<StudentX>
{  
	private int rollNum;  
	private String name;  
	private int age;  
	StudentX(int rollNum,String name,int age)
	{  
		setRollno(rollNum);  
		setName(name);  
		setAge(age);  
	} 
	public void setRollno(int rollNum)
	{
		this.rollNum=rollNum;
	}
	public int getRollNum()
	{
		return rollNum;
	}
	public void setName(String name)
	{
		this.name=name;
	}
	public String getName()
	{
		return name;
	}	
    
	public void setAge(int age)
	{
		this.age=age;
	}
	public int getAge()
	{
		return age;
	}
	
	public String toString()
	{
		return String.format("%s %d %d\n", name, rollNum, age);
	}
	
	public int compareTo(StudentX st)
	{  
		return age -st.age;  
	}  
}  