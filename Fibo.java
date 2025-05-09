class Fibo
{
	public static void main(String[]args)
	{
		int nterm=20;
		int start=1,end=nterm,a=0,b=1,c=0;
		System.out.println("The Fibonacci Series are :");
		System.out.println(a);
		System.out.println(b);
		while(start<end)
		{
			c=a+b;
			a=b;
			b=c;
			System.out.println(c+" ");
			start++;
		}
	}
}
