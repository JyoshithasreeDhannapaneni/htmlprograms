class SumProduct
{
	public static void main(String[]args)
	{
		int num=87,sum=0,product=1;
		int start=1, end=num;
		while(start<num)
		{
			if(num%start==0)
			{
				sum+=start;
				product*=start;
			}
			start++;
		}
		System.out.println("The sum of factors "+sum);
		System.out.println("The product of factors "+ product);
		if(sum==product)
		{
			System.out.println("it is prefect number");
		}
		else
		{
			System.out.println("it is not a prefect number");
		}
	}
}