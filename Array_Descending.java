class Array_Descending
{
	public static void main(String[]args)
	{
		Array_Descending descending=new Array_Descending();
		descending.checkdescending(new int[]{10,90,78,6,3,77});	
	}
void checkdescending(int a[])
{
	int x=0;
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
			System.out.println(temp);//67,37,30,20,10,7
		}

}
}