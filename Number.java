class Number
{
	public static void main(String[]args)
	{
		int num=11;
		while(num>1)
		{
			if(num%2==0)
			{
					num=num/2;
				System.out.println(num);
			}
			else
			{
				num=3*num+1;
			System.out.println(num);
			} 

		}
	}
}