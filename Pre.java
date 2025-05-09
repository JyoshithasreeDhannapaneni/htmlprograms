class Pre
{
	public static void main(String[]args)
	{
		int start=1,end=500,count=0;
		while(start<=end)
		{
			int q=(int)Math.sqrt(start);
			if(q*q==start)
			{
				count++;
				System.out.println("The number is prefect Square "+start);
			} 
			else
			{	count++;
				System.out.println("The number is not prefect Square " +start);
			}
			 start++;
		}
		 System.out.println("The count of prefect square is "+count);
		 System.out.println("The count of not prefect square is "+count);


	}
}