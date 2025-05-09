class Unique_All_Element
{
	public static void main(String[]args)
	{
		int a[]=new int[] {1,2,3,1,2,7,8,9};
		Unique_All_Element element=new Unique_All_Element();
		element.All_element(a);
	}
	final void All_element(int a[])
	{
		int b[]=new int[a.length];
		for(int x=0;x<=a.length-1;x++)
		{
			if(b[x]==1)
			{
			   continue;
			}
			int count=1;
			for(int y=x+1;y<=a.length-1;y++)
			{
				if(a[x]==a[y])
				{
					count++;
					b[y]=1;
				}
			}
		     System.out.println(a[x]);
		  /*if(count==1)
		  {
			System.out.println(a[x]);
		  }
		  else
		  {
			System.out.println(a[x]);
		  }*/
		}
	}	

}