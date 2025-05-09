class Str_Reserve1
{
	public static void main(String []args)
	{
		String s="Hi Everyone";
		System.out.println("Length of the String is: "+s.length());
		Str_Reserve1 re=new Str_Reserve1();
		re.reserve(s);
		 
	}
	public void reserve(String s)
	{
		String rev="";
		for(int x=s.length()-1;x>=0;x--)
		{
			char letter=s.charAt(x);
			rev=rev+letter+" ";
			//System.out.println(rev);
		}
		if(rev.equals(s))
		{
			System.out.println("Palindrome");
		}
		else
		{
			System.out.println("Not Palindrome");
		}
	}
}