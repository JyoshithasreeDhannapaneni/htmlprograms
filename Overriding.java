class Overriding
{
	public static  void main(String[]args)
	{
		Parent parent;//reference Type
		parent=new Child();//Object Type or upcasting
		parent.add("hello");
	}
}
class Parent
{
	/*void add()
	{
		System.out.println("Parent class");
	}*/
	/*public void add()
	{
		System.out.println("int in Parent class");
	}*/
	protected void add(String x)
	{
		System.out.println(x); 
	}
}
class Child extends Parent
{
	 /*void add()
	{
		System.out.println("Child class");
	}*/
	/*int add()
	{
		System.out.println("int in child");
	}*/ /* weak access in the child class it doesnot access while complie time only beacuse it must should have child and parent are equal or child class should greater*/
	
	public void add(String x)
	{
		System.out.println(x);
	}
}