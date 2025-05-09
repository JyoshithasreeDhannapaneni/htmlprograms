class Pattern3
{
	public static void main(String[]args)
	{
		int r=5,c=5;
		for(int x=1;x<r;x++)
		{
			for(int y=1;y<c;y++)
			{
				if(y%2==0)
				{
					System.out.print("#");
				}
				else
				{
					System.out.print("$");	
				}
			}
		  System.out.println(" ");
		}
	}
}