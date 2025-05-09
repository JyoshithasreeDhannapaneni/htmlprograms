class Pattern7
{
	public static void main(String[]args)
	{
		Pattern7 p=new Pattern7();
		p.m1();
		System.out.println("-------------------");
		p.m2();
		System.out.println("-------------------");
		p.m3();
	}
public void m1()
{
	int r=3,c=4;
	for(int i=0;i<=r;i++)
	{
		char l=(char)('A'+i);
	   for(int j=0;j<=c;j++)
	   {
		System.out.print(l+" ");
		l++;
	   }
	System.out.println(" ");
	}
}
public void m2()
{
	int r=5,c=5;
	for(int i=0;i<=r;i++)
	{
          for(int j=1;j<=c;j++)
	  {
		char cap=(char)('A'+i);
		char sam=(char)('a'+i);
		if(i%2==0)
		{
		    //System.out.print(sam+" ");
		    System.out.print(cap+" ");
		}
		else
		{
			System.out.print(sam+" ");
			//System.out.print(cap+" ");
		}
	   }
	    System.out.println(" ");
	 }
}
public void m3()
{
	int r=5,c=6;
	for(int i=0;i<=r;i++)
	{
          for(int j=0;j<=c;j++)
	  {
		char cap=(char)('A'+j);
		char sam=(char)('a'+j);
		if(j%2==0)
		{
		    //System.out.print(sam+" ");
		    System.out.print(cap+" ");
		}
		else
		{
			System.out.print(sam+" ");
			//System.out.print(cap+" ");
		}
	   }
	    System.out.println(" ");
	 }
}
}