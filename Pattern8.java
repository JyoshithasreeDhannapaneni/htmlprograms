class Pattern8
{
	public static void main(String[]args)
	{
		Pattern8 p=new Pattern8();
		p.m1();
		System.out.println("_____________");
		//m2();
	}
public void m1()
{
	int r=5,c=5;
  for(int i=0;i<=r;i++)
  {
    for(int j=0;j<=c;j++)
    {
	System.out.print(i);
    }
    System.out.println("");
  }
}
}