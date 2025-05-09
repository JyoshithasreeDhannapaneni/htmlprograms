class Pattern2
{
	public static void main(String[]args)
	{
		int r=5,c=5;
		for(int i=1;i<=r;i++)
		{
		  for(int j=1;j<=c;j++)
		  {
			if(i%2==0)
			{
			   System.out.print("#"+" ");
			}
			else
			{
			   System.out.print("$"+" ");
			}
		  }
		 System.out.println("");
		}
	}
}