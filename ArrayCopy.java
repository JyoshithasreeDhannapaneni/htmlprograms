class ArrayCopy
{
	public static void main(String[]args)
	{
		int a[]=new int[]{10,45,26};
		ArrayCopy copy=new ArrayCopy();
		int res[]=copy.sum(new int[]{10,45,26},0);
		for(int x=0;x<res.length;x++)
		{
			System.out.println(res[x]);
		}
			
	}
int[] sum(int a[],int total)
{
	int b[]=new int[a.length];
	for(int x=0;x<=a.length-1;x++)
	{
		b[x]=a[x];
		total=total+b[x];
	}
	System.out.println("The Sum of array is : "+total);
	return b;
}
}