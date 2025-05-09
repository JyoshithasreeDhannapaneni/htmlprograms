import java.util.Random;
class Threearrray
{
	public static void main(String[]args)
	{
		Random r=new Random();
		int a[]={10,45,68,79};
		int b[]={12,76,78};
		int c[]=new int[a.length+b.length];
		System.out.println("The Array Elements of c are:");
		for(int x=0;x<a.length;x++)
		{
			c[x]=a[x];
		System.out.println(c[x]);
		}
		for(int x=0;x<b.length;x++)
		{
			c[x]=b[x];
			System.out.println(c[x]);
		}
	}
}