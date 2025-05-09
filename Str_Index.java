class Str_Index
{
	public static void main(String []args)
	{
		String str="Hello all good morning";
		char c[]=str.toCharAt();
		String s2="";
		for(int x=0;x<=str.length()-1;x++)
		{
			if(x%2==0)
			{
			   s2=str.tocharAt(x.toUpperCase());
			}
			else
			{
			    s2=str.tocharAt(x.toLowecase());
			}
		}
		System.out.println(s2);	
	}
}
