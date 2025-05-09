class Constructor
{
	public static void main(String[]args)
	{
		Student s1=new Student();
		s1.print();
		Student s2=new Student(14,"bbb","b@gamil.com","B");
		s2.print();
	}
}
class Student
{
	int roll;
	String name,email, section;
	Student(int r,String n,String e,String s)
	{
		roll =r;
		name=n;
		email=e;
		section=s;
	}
	Student()
	{
		roll=15;
		name="aaa";
		email="a@gmail.com";
		section="A";	
	}
	void print()
	{
		System.out.println(roll+" " +name+" "+email+" "+section);
	}

}