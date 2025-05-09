class Str_Digit
{
	public static void main(String []args)
	{
		String s="Hello all @# 14567@";
		int l=s.length();
		Str_Digit digit=new Str_Digit();
		digit.checkingCount(s);
	}
	public void checkingCount(String s)
	{
		int vowel=0;int consonant=0;int space=0;int symbol=0;int capital=0;int small=0;int digit=0;
		for(int x=0;x<=s.length()-1;x++)
		{
			char letter=s.charAt(x);
			if(letter>='0'&&letter<='9')
			{
				digit++;
			}
			else if(letter>='A'&& letter<='Z')
			{
				if(letter=='A'||letter=='E'||letter=='I'||letter=='O'||letter=='U')
				{
					vowel++;
				}
				else
				{
					consonant++;
				}
			}
			else if(letter>='a'&&letter<='z')
			{
				if(letter=='a'|| letter=='e' ||letter=='i' ||letter=='o' ||letter=='u')
				{
					vowel++;
				}
				else
				{
					consonant++;
				}
			}
			else if(letter==' ')
			{
				space++;
			}
			else
			{
				symbol++;
			}
		
		}
		System.out.println("no.of vowels is: "+vowel);
		System.out.println("no.of consonants is: "+consonant);
		System.out.println("no.of spaces is: "+space);
		System.out.println("no.of symbols is: "+symbol);
		System.out.println("no.of digits is: "+digit);
	}
}