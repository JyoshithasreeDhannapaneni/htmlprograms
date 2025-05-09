class Str_countsymbol
{
	public static void main(String []args)
	{
		String a="HEllo good friends & 123 % work";
		Str_countsymbol symbol=new Str_countsymbol();
		symbol.checkingcount(a);
	}
	public static void checkingcount(String a)
	{
		int upper=0;int lower=0;int symbol=0;int number=0;
		for(int x=0;x<=a.length()-1;x++)
		{
			char letter=a.charAt(x);
			if(letter>='0' && letter<='9')
			{
				number++;
			}
			else if(letter>='A' &&  letter<='Z')
			{
				upper++;
			}
			else if(letter>='a' && letter<='z')
			{
				lower++;
			}
			else
			{
				symbol++;
			}
		}
		System.out.println("no.of Uppercase letter is: "+upper);
		System.out.println("no.of Lowercase letter is: "+lower);
		System.out.println("no.of number present in string is: "+number);
		System.out.println("no.of symbol present in String is: "+symbol);
	}
}