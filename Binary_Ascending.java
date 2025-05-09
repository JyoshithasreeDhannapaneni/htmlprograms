class Binary_Ascending
{
	public static void main(String[]args)
	{
		Binary_Ascending ascending=new Binary_Ascending();
		ascending.checkascendingorder(new int[]{80,10,2,3,8,67,7},7);
	}
void checkascendingorder(int a[], int search)
{
	int x=0;
		for(;x<a.length-1;x++)
		{
			for(int y=x+1;y<=a.length-1;y++)
			{	
				if(a[x]>a[y])/*ascending order*/
				{
					int b=a[x];
					a[x]=a[y];
					a[y]=b;
				}
			}
		}
		for(int temp:a)
		{
			System.out.println(temp);//2 3 7 8 10 
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
			  	f=m+1;
			}
			else if(search<a[m])//30<37t
			{
				l=m-1;
			}
		}
		if(f>l)
		{
			System.out.println("Element is not found");
		}


}
}