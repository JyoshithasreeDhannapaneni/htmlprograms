import java.util.Scanner;
class AverageArray
{
	public static void main(String[]args)
	{
		Scanner sc=new Scanner(System.in);
		int size=sc.nextInt();
		int a[]=new int[size];
		int sum=0;
		int x=0;
		for(int i=0;i<size;i++)
		{
			a[i]=sc.nextInt();
			sum=sum+a[i];
		}
			x=sum/size;
		System.out.println("The average of array elements is"+x);
	}
}