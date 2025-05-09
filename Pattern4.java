class Pattern4
{
	public static void main(String[]args)
	{
		int r=6,c=6;
		for(int i=1;i<r;i++)
		{
		   for(int j=1;j<c;j++)
		   {
			if(i==j)
			{
			   System.out.print("#"+" ");
			}
			else
			{
				System.out.print("$"+" ");
			}
		   }
		System.out.println(" ");
		}
	}
}