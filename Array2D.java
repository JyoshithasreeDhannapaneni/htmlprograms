class Array2D
{
	public static void main(String[]args)
	{
		int a[][]={{1,2,3},{4,5,6},{7,8,9},{10,11,12},{13,14,15}};
		Array2D array=new Array2D();
		array.Loop(a);
	}
public void Loop(int a[][])
{
	for(int t[]:a)
	{
		for(int t2:t)
		{
			System.out.println(t2);
		}
	}
}
}
