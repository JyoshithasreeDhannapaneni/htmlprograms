class Str_Reverseorder
{
	public static void main(String[]args)
	{
		String a="hello";
		Str_Reverseorder order=new Str_Reverseorder();
		order.reverse(a);
	}
	final void reverse(String a)
	{
		for(int x=a.length()-1;x>=0;x--)
		{
			char letter=a.charAt(x);
			System.out.println(letter);
		}
	
	}
}