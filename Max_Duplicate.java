class Max_Duplicate
{
	public static void main(String[]args)
	{
		int a[]=new int[]{1,1,2,3,4,6,7,4,2,2};
		int max=0;
		Max_Duplicate d=new Max_Duplicate();
		d.Maxduplicate(a,0);
	}
	public void Maxduplicate(int a[],int max)
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
			/*if(count>1)
			{
				if(a[x]>max)
				{
					max=a[x];
				}
			}*/
			if(count==1)
			{
				if(a[x]>max)
				{
					max=a[x];
				}
			}
		}
		System.out.println(" Max unique is:"+max);
		/*System.out.println(" Max Duplicate is: "+max);*/
	}
}