class Str_Line
{
	public static void main(String []args)
	{
		String str="Hello all good morning";
		String str1="";
		String s=str.split(" ");
		Str_Line line= new Str_Line();
		line.Checking_word(str,str1)
	}
	public void Checking_word(String str,String str1)
	{	
		for(int x=0;x<=str.length()-1;x++)
		{
			str1=str.charAt(x);
			str=str1+str;
			
		}
		System.out.println(str);
	}
}