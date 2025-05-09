class Asample
{
	public static void main(String[]args)
	{
		Child p= new Child();
		p.add();
		p.sub();
		p.mul();
		p.div();
		p.mod();	
	}
}
abstract class Parent
{
	int a;
	int b;
	Parent()
	{
		a=30;
		b=40;
	}
	public void add()
	{
		System.out.println(a+b);	
	}
	public abstract void sub();
	public abstract void mul();
}
class Child extends Parent
{
	int x;
	int y;
	Child()
	{
		x=40;
		y=30;
	}
	public void mul()
	{
		System.out.println(a*b);
	}
	public void sub()
	{
		System.out.println(a-b);
	}
	public void div()
	{
		System.out.println(x/y);
	}
	public void mod()
	{
		System.out.println(x%y);
	}
}
