class Str_character
{
	public static void main(String[]args)
	{
		String c="jyoshi";
		Str_character str=new Str_character();
		str.character(c);
	}
	public void character(String c)
	{
		for(int x=0;x<=c.length()-1;x++)
		{
			char letter=c.charAt(x);
			System.out.println(letter);
		}
		System.out.println("============================="+"\n"+"Reverse character of a string");
		for(int x=c.length()-1;x>=0;x--)
		{
			char letter=c.charAt(x);
			System.out.println(letter);
		}	
	}
}