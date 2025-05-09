class Str_Palindrome
{
	public static void main(String []args)
	{
		String s="amanaplanacanalpanama";
		String s1="";
		for(int x=0;x<=s.length()-1;x++)
		{
			char letter=s.charAt(x);
			if((letter>='A' && letter<='Z')||(letter>='a' && letter<='z'))
			{
				s1=s1+letter;
				//System.out.println(s1);
			}
		}
		System.out.println(s1);
		StringBuffer sb=new StringBuffer(s1);
		sb.reverse();
		String rev=sb.toString();
		System.out.println(s1.equals(rev)?"Palindrome":"Not a Palindrome");
	}
}