class Last_Element
{
	public static void main(String[]args)
	{
		int a[]=new int[]{1,2,3,5,1,2,8,9,8,6,7};
		Last_Element last=new Last_Element();
		last.Unique(a);
	}
	public void Unique(int a[])
	{
		int b[]=new int[a.length];
		for(int x=a.length-1;x>=0;x--)
		{
			if(b[x]==1)
			{
				continue;
			}
		  int count=1;
			for(int y=x-1;y>=0;y--)
			{
				if(a[x]==a[y])
				{
					count++;
					b[y]=1;
				}
			}
			/*if(count==1)
			{
				System.out.println(a[x]);
				break;
			}*/
			if(count>1)
			{
				System.out.println(a[x]);	
				break;
			}
		}
		
	}
}