Class In
{
	int countdigit(int num)
	{
		int count=0;
		while(num!=0)
		{
			count++;
			num=num/10;
		}
		return count;
	}
	int sumdigit(int num)
	{
		int sum=0;
		while(num>0)
		{
			int rem=num%10;
			sum=sum+rem;
			num=num/10;
		}
		return sum;
	}
	public static void main(String[]arg)
	{
		In i=new In();
		i.countdigit();
		int result=i.sumdigit();
	}
}