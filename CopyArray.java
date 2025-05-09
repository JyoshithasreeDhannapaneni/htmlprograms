import java.util.Scanner;
class CopyArray
{
	public static void main(String[]args)
	{
		Scanner sc=new Scanner(System.in);
		int size=sc.nextInt();
		int a[]=new int[size];
		int b[]=new int[size];
		for(int x=0;x<size;x++)
		{
			a[x]=sc.nextInt();
		}
		System.out.println("The Array Elements of a is:");
		for(int x=0;x<size;x++)
		{
			System.out.println(a[x]);
		}
			System.out.println("The Array Elements of b are:");
		for(int x=0;x<size;x++)
		{
			b[x]=a[x];
			System.out.println(b[x]);
		}

	}
}
