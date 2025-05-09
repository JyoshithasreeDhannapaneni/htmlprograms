class Unique
{
	public static void main(String[]args)
	{
		int a[]=new int[]{1,2,3,4,1,2,3,5,6,9,7,0};
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
		if(count==1)
		{
			System.out.println("The unique elements are:"+a[x]);
		}
		else
		{
			System.out.println("The Dualipate elements are:"+a[x]);
		}
	 	}
	}
}