class Array1
{
	public static void main(String[]args)
	{
		int[] a=new int[]{10,20,30,40,50};
				//0  1   2  3  4
				//50 10 20 30 40
		int b=a[a.length-1];
		for(int x=a.length-1;x>=0;x--)
		{
			if(x>0)
			{ 
			  	a[x]=a[x-1];
			}
		
		}
		a[0]=b;
		for(int x=0; x<a.length;x++)
		{
			System.out.println(a[x]);
		}		
	}
}