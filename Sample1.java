class Sample1
{
	public static void main(String[]args)
	{
		Child c=new Child();
		c.add();	
	}
}
abstract class Parent
{
	public abstract void add();
	public void sub()
	{
		System.out.println("Hi i am not abstract");
	}
}
class Child extends Parent
{
	@Override
	public void add()
	{
		System.out.println("Hi I am Abstract");
	}
}