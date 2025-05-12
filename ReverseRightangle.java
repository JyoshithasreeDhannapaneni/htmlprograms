class ReverseRightangle
{
	public static void main(String[]args)
	{
	 ReverseRightangle t=new ReverseRightangle();	
	 t.m1();
	 t.m2();
	}
public void m1()
{
	int row=5;
	for(int x=1;x<=row;x++)
	{
	  for(int y=row;y>=x;y--)
	  {
	   System.out.print("# ");
	  }
		System.out.println("");
	}
}
public void m2()
{
	int row=5;
	for(int x=1;x<=row;x++)
	{
	  for(int y=row;y>=x;y--)
	  {
	   System.out.print("# ");
	  }
		System.out.println("  ");
	  for(int y=1;y<=row-1;y++)
	  {
		System.out.print("- ");
	  }
	}
}
}