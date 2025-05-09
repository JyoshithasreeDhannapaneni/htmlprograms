class Str_Line
{
	public static void main(String []args)
	{
		String s1="hello all good morning";
		String str[]=s1.split(" ");
		String s2="";
		for(String t:str)
		{
			System.out.println(t);
			 if(t=="hello")
			 {
			   t.toUpperCase();
			   System.out.println(s2);
			 }
		}
	}
}