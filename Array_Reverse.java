class Array_Reverse
{
	public static void main(String[] args)
	{
		int a[]={12,56,23,67,76,32,75,90,345};
		Array_Reverse res=new Array_Reverse();
		res.reverse(a);
		System.out.println("========================");
		res.even_Index(a);
		System.out.println("========================");
		/*res.odd_index(a);
		System.out.println("========================");*/
	}
	final void reverse(int a[])
	{
		int b[]=new int[a.length];
		for(int x=a.length-1;x>=0;x--)
		{
			b[x]=a[x];
			System.out.println(b[x]);
		}
	}
	public void even_Index(int a[])
	{
		for(int x=0;x<=a.length-1;x++)
		{
			if(x%2==0)
			{
			    System.out.println("a["+x+"]= "+a[x]);
			}
		}
	}
	public void odd_Index(int a[])
	{
		for(int x=0;x<=a.length-1;x++)
		{
			if(x%3==0)
			{
			  System.out.println("a["+x+"]= "+a[x]);
			}
		}
	}
}