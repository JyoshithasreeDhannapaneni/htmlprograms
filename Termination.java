class Termination
{
	public static void main(String[]args)
	{
		Next n=new Next();
		n.m1();
	}
}
class Next
{
	public void m1()
	{
		m2();
	}
	public void m2()
	{
		System.out.println(10/0);//here the exception is Occuring(Arithematic Exception) //
	}
}