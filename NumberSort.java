class NumberSort
{
	public static void main(String []args)
	{
		int a[]={55,40,80,65,72};
		System.out.println(a.length);//array length
	}
	final checking_Sorted(int a[])
	{
		for(int x=0;x<=a.length-1;x++)
		{
			for(int y=x+1;y<=a.length-1;y++)
			{
				if(a[x]>a[y])
				{
					int temp=a[x];
					a[x]=a[y];
					a[y]=temp;
				}
			}
		}
		System.out.println(a[y]);
	}
}