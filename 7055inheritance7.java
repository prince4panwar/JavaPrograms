// Write a Java program to create a class known as Person with methods called getFirstName() and getLastName(). Create a subclass called Employee that adds a new method named getEmployeeId() and overrides the getLastName() method to include the employee's job title
class Person
{
     String firstName = "";
     String lastName = "";
    public void setFirstName()
    {
        System.out.println("Enter a first Name :-");
        java.util.Scanner  s = new java.util.Scanner(System.in);
        firstName = s.nextLine();
    }
    public void setlLastName()
    {
         System.out.println("Enter a last Name :-");
        java.util.Scanner  s = new java.util.Scanner(System.in);
        lastName = s.nextLine();
    }
    public String getFirstName()
    {
        return firstName;
    }
    public String getLastName()
    {
       return lastName;
    }
}
class Employee extends Person
{
    private int empId;
    private String empJobTitle = "";
    public void setEmployeeId()
    {
        System.out.println("Enter a employee id :-");
         java.util.Scanner s = new java.util.Scanner(System.in);
        empId = s.nextInt();
    }
    public int getEmployeeId()
    {
        return empId;
    }
    public void setJobTitle()
    {
        System.out.println("Enter a job Title :-");
        java.util.Scanner  s = new java.util.Scanner(System.in);
        empJobTitle = s.nextLine();
    }
    public String getLastName()
    {
        return lastName + empJobTitle;
    }
 
}
class Check
{
    public static void main(String safas[])
    {
        Employee e = new Employee();
        e.setFirstName();
        e.setlLastName();
       System.out.println( e.getFirstName());
       System.out.println( e.getLastName());
        e.setEmployeeId();
        System.out.println(e.getEmployeeId());
        e.setJobTitle();
        System.out.println( e.getLastName());
        
    }
}