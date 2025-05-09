class Palindrom
{
	public static void main(String[]args)
	{
		int num=121,rem=0,rev=0,tem=num;
		while(num>0)
		{
			rem=num%10;
			rev=rev*10+rem;
			num=num/10;
			System.out.println(rem);
		}
		temp=num;
		System.out.println(rev==num?num+"is a Palindrom number":num+"is not a palindrom number");
	}
}