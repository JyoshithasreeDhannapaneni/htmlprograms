class DoReserve
{
	public static void main(String[]args)
	{
		int num=12345,rev=0,rem=0;
		do
		{
		rem=num%10;
		rev=rev*10+rem;
		num=num/10;
		}
		while(num!=0);
			System.out.println(rev);
	}
}