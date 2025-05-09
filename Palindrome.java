class Palindrome
{
	static void checkPalindrome(int num,int rev)
	{
		int temp=num;
		while(temp!=0)
		{
		   int rem=temp%10;
		   rev=rev*10+rem;
		   temp=temp/10;
		}
		System.out.println(rev);
		if(num==rev)
		{
			System.out.println("palindrome number");
		}
	}
   	public static void main(String[]args)
	{
		Palindrome p= new Palindrome();
		p.checkPalindrome(121,0);
	}
}