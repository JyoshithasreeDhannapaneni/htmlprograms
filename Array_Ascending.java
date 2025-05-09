class Array_Ascending
{
	public static void main(String[]args)
	{
		Array_Ascending ascending=new Array_Ascending();
		ascending.checkascending(new int[]{10,9,4,68,78,3,9});
	}
  void checkascending(int a[])
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
			System.out.println(temp);
		}
}
}