class Sort_Delete_Insert
{
	public static void main(String[]args)
	{
		int a[]=new int[]{10,7,9,30,44,-2,-7,-6, 0, 45};
			       // 0, 1,2, 3, 4,5, 6, 7
		Sort_Delete_Insert delete=new Sort_Delete_Insert();
		delete.sortingascending(a,47);
		
	}
	void sortingascending(int a[],int search)
	{
		for(int x=0;x<a.length-1;x++)
		{
			for(int y=x+1;y<=a.length-1;y++)
			{	
				if(a[x]>a[y])
				{
					int b=a[x];
					a[x]=a[y];
					a[y]=b;
				}
			}
		}
		System.out.println("After sorting elements");
		for(int temp:a)
		{
			System.out.println(temp);//0,7,9,10,11,30,44,45
						// 0 1 2  3  4  5  6  7
		}
		int f=0;
		int l=a.length-1;
		int m=0;
		while(f<=l)
		{
			m=(f+l)/2;
			if(search==a[m])
			{
				System.out.println("element is found"+" and here deleting the found element ");
				int x=0;
				for(x=m;x<a.length-1;x++)
				{
					a[x]=a[x+1];
				}
				a[x]=0;//last index will be zero
			for(int n:a)
			{
				System.out.println(n);	
			}
			break;	
			}
			else if(search>a[m])
			{
				f=m+1;
			}
			else
			{
				l=m-1
			}
		}
		if(f>l)
		{
			int i=0,k=47;
			for(int x=a.length-2;x>=i;x--)
			{
				if(a[i]==0)
				{
					a[i]=k;	
				}
			}
			a[i]=k;
			System.out.println("Inserting  elements");
			for(int t:a)
			{
				System.out.println(t);
			}
		}
	}
}