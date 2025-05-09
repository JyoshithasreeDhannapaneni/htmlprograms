class ReserveArray
{
	public static void main(String[]args)
	{
		int a[][]={{1,2,3,5},{1,2,6,8},{2,3,4,6},{3,5,9,3}};
		int b[][]=new int[4][4];
		ReserveArray array=new ReserveArray();
		array.reserve(a,b);
	}
	public void reserve(int a[][],int b[][])
	{
		for(int r=0;r<=a.length-1;r++)
		{
			for(int c=0;c<=a[r].length-1;c++)
			{
				System.out.print(a[r][c]+" ");
			}
		    System.out.println();
		}
		System.out.println("After the transportion of the array");
		for(int r=0;r<=a.length-1;r++)
		{
			for(int c=0;c<=a[r].length-1;c++)
			{
				b[r][c]=a[c][r];
				System.out.print(b[r][c]+" ");
			}
		    System.out.println();
		}
	}
}