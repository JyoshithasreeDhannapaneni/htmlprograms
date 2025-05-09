class Hi
{
	public static void main(String[]args)
	{	
		Parent p= new Parent();
		p.add();
		p.sub();
		p.div();
		p.mod();
	}
}
class Parent implements Parent1,Parent2
{
	public void add()
	{
		System.out.println(30+30);
	}
	public void sub()
	{
		System.out.println(40-20);
	}
	public void div()
	{
		System.out.println(30/30);
	}
	public void mod()
	{
		System.out.println(40%20);
	}

}
interface Parent1
{	/*protected void add(); it doesnot allow the protected type in the interface*/
	public void add();
	public void sub();//in the interface we must declare only public.
	/*void sub(); it doesnot allow the error will occur.*/
}
interface Parent2
{	/*protected void add(); it doesnot allow the protected type in the interface*/
	public void div();
	public void mod();//in the interface we must declare only public.
	/*void sub(); it doesnot allow the error will occur.*/
}