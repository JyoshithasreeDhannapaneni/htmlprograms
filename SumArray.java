import java.util.Scanner;
class SumArray
{
	public static void main(String[]args)
	{
		Scanner s=new Scanner(System.in);
		int size=s.nextInt();
		int a[]=new int[size];
		int b[]=new int[size];
		int sum=0;
		for(int x=0;x<size;x++)
		{
			a[x]=s.nextInt();
			sum=sum+a[x];
		}		
		System.out.println("Sum of the Array is: "+sum);
		System.out.println("Array of a elements are:");
		for(int x=0;x<size;x++)
		{
			if(a[x]%2==0)
			{
				System.out.println("a["+x+"]="+a[x]);
			}
		}
		for(int x=0;x<size;x++)
		{
			if(x%2==0)
			{
				System.out.println("a["+x+"]="+a[x]);
			}
		}
		System.out.println("Array of b elements are:");
		for(int x=0;x<size;x++)
		{
			b[x]=a[x];
			if(b[x]%2==0)
			{
				System.out.println("b["+x+"]="+b[x]);
			}
		}	
		for(int x=0;x<size;x++)
		{
			if(b[x]%2!=0)
			{
				System.out.println("b["+x+"]="+b[x]);
			}
		}
			
	}
}