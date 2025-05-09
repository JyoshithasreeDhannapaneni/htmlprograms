import java.util.Scanner;
class PerfectSquareArray
{
	public static void main(String[]args)
	{
		Scanner s=new Scanner(System.in);
		int size=s.nextInt();
		int a[]=new int[size];
		int b[]=new int[size];
		int c[]=new int[size];
		for(int x=0,y=0,z=0;x<size;x++)
		{
			a[x]=s.nextInt();
			System.out.println("a["+x+"]="+a[x]);
		}
		for(int x=0,y=0,z=0;x<size;x++)
		{
			int i=(int)Math.sqrt(a[x]);
			if(i*i==a[x])
			{
				System.out.println("b["+y+"]="+b[y]);
			}
			else
			{
				System.out.println("c["+z+"]="+c[z]);
				z++;
			}
		}
			
	}
	
}