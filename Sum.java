class Sum
{
	public static void main(String[]args)
	{
		int num=6,sum=0,pro=1,count=0;
		int start=1;
		while(start<num)
		{
			if(num%start==0)
			{
				sum+=start;
				count++;
				pro*=start;
			}
			start++;
		}
			System.out.println("The sum of factor is "+sum);
			System.out.println("The count of factor is "+count);
			System.out.println("The Product of factor is "+pro);
	}
}