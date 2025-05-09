class Binary
{
	public static void main(String[]args)
	{
		Binary binary=new Binary();
		binary.checkBinarysearch(new int[]{3,5,2,1,4},1);
						// 0 
	}
	void checkBinarysearch(int a[],int search) /*descending order*/
	{ int x=0;
		for(;x<a.length-1;x++)
		{
			for(int y=x+1;y<=a.length-1;y++)
			{	
				if(a[x]<a[y])/*descending order*/
				{
					int b=a[x];
					a[x]=a[y];
					a[y]=b;
				}
			}
		}
		for(int temp:a)
		{
			System.out.println(temp);//5, 4,3,2,1
						// 0, 1,2,3,4
		}
		int f=0;
		int l=a.length-1;
		int m=0;
		while(f<=l)
		{
			m=(f+l)/2;//2,3
			if(search==a[m])//30==20f,30==37f
			{
				System.out.println("Element is found");
				break;
			}
			else if(search>a[m])//30>20t//30>10//30>37f
			{
			  	l=m-1;
			}
			else if(search<a[m])//30<37t
			{
				f=m+1;
			}
		}
		if(f>l)
		{
			System.out.println("Element is not found");
		}

	}

}