import java.util.Scanner;
class EvenArray
{
	public static void main(String[]args)
	{
		Scanner s=new Scanner(System.in);
		int size=s.nextInt();
		int a[]=new int[size];
		int b[]=new int[size];
		for(int x=0;x<size;x++)
		{
			a[x]=s.nextInt();
			System.out.println("a["+x+"]="+a[x]);
		}
		for(int x=0;x<size;x++)
		{
			if(x%2==0)
			{	
			b[x]=a[x];
			System.out.println("b["+x+"]="+b[x]);
			}
		}
	}
}