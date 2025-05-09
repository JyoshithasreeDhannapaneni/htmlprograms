class Str_length
{
	public static void main(String[]args)
	{
		String a="Greeks for Greeks";
		//System.out.println(a.length());
		Str_length length=new Str_length();
		length.checking_Length(a);
	}
	final void checking_Length(String a)
	{
		int count=0;
		for(int x=0;x<=a.length()-1;x++)
		{
			char letter=a.charAt(x);
			count++;
		}
	   System.out.println("Length of the String is: "+count); 
	}
}