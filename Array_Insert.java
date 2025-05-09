class Array_Insert
{
	public static void main(String[]args)
	{
		int a[]=new int[]{1,5,6,8,3,9,8,0};
		int i=5;
		int k=7;
		for(int x=a.length-2;x>=i;x--)
		{
			a[x+1]=a[x];
		}
		a[i]=k;
		for(int temp:a)
		{
			System.out.println(temp);
		}	
	}
}