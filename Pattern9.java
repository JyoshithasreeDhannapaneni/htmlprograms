class Pattern9
{
	public static void main(String[]args)
	{
		Pattern9 p=new Pattern9();
		p.m1();
		p.m2();
	}	
public void m1()
{
	int row=5;
	for(int x=1;x<=row;x++)
	{
	  for(int y=row;y>=x;y--)
	  {
		System.out.print("#"+"");
	  }
	  System.out.println("");
	}
	 for(int r=2;r<=5;r++)
	  {
	   for(int z=1;z<=r;z++)
	  {
		System.out.print("#"+"");
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
		if(y==row||x==y||x==1)
		{
		  System.out.print("#"+"");
		}
		else{
		System.out.print();
		}
		
	  }
	  System.out.println("");
	}
	 for(int r=2;r<=5;r++)
	  {
	   for(int z=1;z<=r;z++)
	  {
		//if(z==row||
		System.out.print("#"+"");
	  }
	  System.out.println("");
	}
}
}