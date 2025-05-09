class Str_Ignore
{
	public static void main(String[]args)
	{
		String s= "121 Madam";
		Str_Ignore nore=new Str_Ignore();
		nore.checking_Palindrome(s);
	}	
	public void checking_Palindrome(String s)
	{	String res="",digit=" ";
		for(int x=0;x<=s.length()-1;x++)
		{
			char l=s.charAt(x);
			res=res+l;
			if(l>=0&&l<=9)
			{
				digit=digit+l;
			}
		}	
		if(digit==s)
			{	
				System.out.println("Palindrom");
			}
			else
			{
				System.out.println("Not Palindrome");
			}

	}
}