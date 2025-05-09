class Rotation2
{
	public static void main(String[]args)
	{
		int a[]={10,9,8,7,6,5};
		System.out.println("Before left rotation of element");
		for(int temp:a)
		{
			System.out.println(temp);
		}

		int rotation=4;
		System.out.println("After left rotation of the element");
		for(int r=0;r<=rotation;r++)
		{
			int l=a.length-1;
			int x=0;
			for(x=a.length-1;x>0;x--)
			{
				a[x]=a[x-1];
			} 
			a[x]=l;
			System.out.println("rotation"+r);
			for(int temp:a)
			{
			System.out.println(temp);
			}

		}
	}
}