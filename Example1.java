class Example1
{
	public static void main(String[]args)
	{
		Example1 e=new Example1();
		//e.CheckingException(); 
		e.Exception();
	}
	public void CheckingException()
	{
		try
		{
			System.out.println(10/0);
		}
		catch(ArithmeticException e)
		{
			System.out.println("Error:Arithmetic Exception");
		}
		finally
		{
			System.out.println("program will continues after handilng the exception only");
		}
	}
	public void Exception()
	{
		String s=null;
		try
		{
			System.out.println(s.length());
			System.out.println(100/0);
		}
		catch(NullPointerException e)
		{
			System.out.println("Error:It doesnot have any length & NullPointerException is Occuring");
		}
		catch(ArithmeticException e)
		{
			System.out.println("Error:occuring ");
		}
		finally
		{
			System.out.println("after handing the exception the program will continues");
		}
	}
}