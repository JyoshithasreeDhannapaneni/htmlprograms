class UniqueMethod
{
	public static void main(String[]args)
	{
		int a[]=new int[] {1,2,3,4,1,2,3,5,6,9,7,0};
		UniqueMethod m=new UniqueMethod();
		m.Unique(a);
		//m.Duplicate(new int[] {1,2,3,4,1,2,3,5,6,9,7,0});
		//m.frequency(new int[] {1,2,3,4,1,2,3,5,6,9,7,0});
	}
public void Unique(int a[]) 
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
		if(count==1)
		{
			System.out.println(a[x]);
		}

	}
}
/*final void Duplicate(int a[])
{
		int x;
		for(x=0;x<=a.length-1;x++)
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
			}
		}
}*/
/*protected void Frequency(int a[])
{	int x;
	for(x=0;x<=a.length-1;x++)
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
		System.out.println("Frequency of the Unqine Element of "+a[x]+ " is "+count);
		}*/
		/*if(count>1)
		{
			System.out.println("Frequency of Dulipcate Element of "+a[x]+" is "+count);
		}
	}
}*/
}