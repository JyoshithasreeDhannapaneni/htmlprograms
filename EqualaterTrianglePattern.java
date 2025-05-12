class EqualaterTrianglePattern
{
	public static void main(String[]args)
	{
		EqualaterTrianglePattern e=new EqualaterTrianglePattern();
		e.m1();
		System.out.println("--------------------------------------");
		e.m2();
		System.out.println("---------------------------------------");
		e.m3();
	}
public void m1()
{
  int row=5;
	for(int r=1;r<=row-1;r++)
	{
	  for( int c=row;c>=r;c--)
	  {
	    	System.out.print("  ");
	  }
	 for(int c=1;c<=r;c++)
	 {
		System.out.print(" #  ");
	  }
	    System.out.println();
	 }


}
public void m2()
{
 int row=5;
for(int r=1;r<=row;r++)
{
 for(int c=1;c<=r;c++)
 {
   System.out.print("  ");
 }
  for( int c=row;c>=r;c--)
  {
	System.out.print(" #  ");
  }
   System.out.println();	
 }

}
 public void m3()
{
	int row=5;
	for(int r=1;r<=row-1;r++)
	{
	  for( int c=row;c>=r;c--)
	  {
	    	System.out.print("  ");
	  }
	 for(int c=1;c<=r;c++)
	 {
		System.out.print(" #  ");
	  }
	    System.out.println();
	 }
	 for(int r=1;r<=row;r++)
	{
	 for(int c=1;c<=r;c++)
	 {
		System.out.print("  ");
	  }
	  for( int c=row;c>=r;c--)
	  {
	    	System.out.print(" #  ");
	  }
	    System.out.println();
	 }
}
}