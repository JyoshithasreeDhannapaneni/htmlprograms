import java.util.Scanner;
class SwapArray
{
	public static void main(String[]args)
	{
		Scanner s=new Scanner(System.in);
		int size=s.nextInt();
	  	int a[]=new int[size];
		int b[]=new int[size];
		int c[]=new int[size];
		for(int x=0;x<size;x++)
		{
			a[x]=s.nextInt();
			System.out.println("a["+x+"]="+a[x]);
		}
		for(int x=0;x<size;x++)
		{
			b[x]=s.nextInt();
			System.out.println("b["+x+"]="+b[x]);
		}
		System.out.println("Swaping of element in array are:");
		for(int x=0;x<size;x++)
		{
			b[x]=a[x];
			System.out.println("b["+x+"]="+a[x]);
		}	
		for(int x=0;x<size;x++)
		{
			c[x]=b[x];
			System.out.println("c["+x+"]="+b[x]);

		}
		for(int x=0;x<size;x++)
		{
			a[x]=c[x];
			System.out.println("a["+x+"]="+c[x]);
		}
	}
}