class Graceful//the graceful termination is doesnot having exception while runing the code is know as graceful termination//
{
	public static void main(String[]args)
	{
		Sample s=new Sample();
		s.m1();
	}
}
class Sample
{
	public void m1()
	{
		m2();
	}
	public void m2()
	{
		System.out.println(10+20);
	}
}