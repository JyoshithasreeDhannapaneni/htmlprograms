class ArrayAddition
{
	public static void main(String[]args)
	{
		int a[][]={{1,2,3},{4,5,6},{7,8,9}};
		int b[][]={{1,3,5},{2,3,7},{7,6,2}};
		ArrayAddition add=new ArrayAddition();
		add.Addition(a,b);
	}
	public void Addition(int a[][],int b[][])
	{
		int c[][]=new int[3][3];
		for(int r=0;r<=a.length-1;r++)
		{
			for(int c1=0;c1<=a[r].length-1;c1++)
			{
			   c[r][c1]=a[r][c1]+b[r][c1];
			}
		}
		for(int[] row:c)
		{
			for(int r1:row)
			{
				System.out.print(r1+"  ");
			}
		System.out.println();
		}
	}
}