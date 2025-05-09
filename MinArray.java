import java.util.Scanner;
class MinArray
{
	public static void main(String[]args)
	{
		Scanner s=new Scanner(System.in);
		int size=s.nextInt();
		int a[]=new int[size];
		int max=0;
		int min=Integer.MAX_VALUE;
		for(int x=0;x<size;x++)
		{
			a[x]=s.nextInt();
			System.out.println("a["+x+"]="+a[x]);
		}
		for(int x=0;x<size;x++)
		{
			if(a[x]>max)
			{
				System.out.println("a["+x+"]="+a[x]);
				max=a[x];
			}

		}
		System.out.println("The max element in Array is : "+max);
		for(int x=0;x<size;x++)
		{

			if(min>a[x])
			{
				System.out.println("a["+x+"]="+a[x]);
				min=a[x];
			}
		}
			System.out.println("The min element in Array is: "+min);
	}
}