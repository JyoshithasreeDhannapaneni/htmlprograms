public class palindrome 
{
	int ispalindrome(int num,int rem,int rev)
	{
		while(num>0)
		{
		     num=num%10;
		     rem=num*10;
		     rev=num/10;
		}
		return rem;
		}
		class Main
		{
			public static void main(String[]args)
			{
				palindrome p=new palindrome();
				int result=p.ispalindrome(121,0,0);
				System.out.println(result);
			}
		}
	    	 void checkpalindrome(int num,int rem)
		 { 
			if(num==rem)
			{
				System.out.println("PALINDROME");
			}
			else
			{
				System.out.println("NOT PALINDROME");
			}
		 }
}