class Rotation
{
	public static void main(String[]args)
	{  
		int a[]={1,8,9,4,3,9};//left Rotation of the array
		int rotation=3;
		System.out.println("before rotation of array:");
		for(int temp:a)
		{
			System.out.println(temp);
		}
		System.out.println("After rotation of array:");
		for(int r=1;r<=rotation;r++)
		{	int x=0;
			int t=a[0];
			for(x=0;x<a.length-1;x++)
			{
				a[x]=a[x+1];
				
			}
			a[x]=t;
			System.out.println("rotation"+r);
		for(int temp:a)
		{
			System.out.println(temp);
		}
		}
	}
}