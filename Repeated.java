class Repeated
{
	public static void main(String[]args)
	{
		int a[]=new int[]{1,2,3,4,2,2,2,4,2,1,2,4,7,7};
		Repeated r=new Repeated();
		r.Duplicate_max(a);
		//r.Duplicate_last(a);
	}
	public void Duplicate_max(int a[])
	{
		int max=0;
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
		     if(max<count)
		     {
			max=a[x];

		     }
		   }
		}
		System.out.println(max);
	}
}