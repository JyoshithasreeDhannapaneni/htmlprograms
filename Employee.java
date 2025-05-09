class Employee
{
	private String name;
	private int Id;
public Employee(String name)//Constructors overloaded
{
	System.out.println("Name of the Employee: "+name);
}
public Employee(String name,String email)//Constructor Overloaded
{
	this.name=name;
	System.out.println("Name of the Employee is: "+name+"\nEmail of the Employee: "+email);
}
public Employee(double Salary,int Id)//Constructor Overloaded
{
	this.Id=Id;
	System.out.println("Employee Salary is : "+Salary);
	System.out.println("Employee Id : "+Id);
}
public void display()//method calling
{
	//int Id=7;
	if(Id !=0)
	{
		System.out.println("ID :"+Id);
	}
}
public static void main(String[]args)
{
	Employee e=new Employee("joshi");
	e.display();
	Employee e1=new Employee("Praveen","p@gmail.com");
	e1.display();
	Employee e2=new Employee(50000,201);
	e2.display();
}
}