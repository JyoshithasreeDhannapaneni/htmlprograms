class Duplicate
{
	public static void main(String[]arg)
	{
		int a[]= new int[]{2,3,6,9,1,2,3,6,86,76,86};
		Duplicate d=new Duplicate();
		d.first_Duplicate(a);
	}
	final public void first_Duplicate(int a[])
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
		  if(count>1)
		  {
			System.out.println(a[x]);
			break;
		  } /* (First Duplicate) */
		  /*if(count==1)
		  {
			System.out.println(a[x]);
			break;
		  }*/ /* (First Unique)*/
		}	
	}	 
}