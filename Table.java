class Table
{
	public static void main(String[]args)
	{
		int x=1,table=2,z=10;
		while(x<=10)
		{
			int y=x*table;
			System.out.println(table+"X"+x+"="+y);
			x+=1;
		}
		while(z>=1)
		{
			int a=z*table;
			System.out.println(table+"X"+z+"="+a);
			z-=1;
		}
	}
}