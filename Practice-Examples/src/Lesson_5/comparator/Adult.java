package Lesson_5.comparator;

class Adult
{ 
    private String name; 
    private Integer age; 
  
    public Adult(String name, Integer age) { 
        setName(name); 
        setAge(age); 
    } 
    
    public String getName() 
    { 
        return name; 
    } 
  
    public void setName(String name) 
    { 
        this.name = name; 
    } 
  
    public Integer getAge() 
    { 
        return age; 
    } 
  
    public void setAge(Integer age) 
    { 
        this.age = age; 
    } 
  
    // overriding toString() method 
    public String toString() 
    { 
        return String.format("Name = %s Age = %d\n", name, age); 
    }
}