class Str_Vowel
{
	public static void main(String []args)
	{
		String a=" Hi Good 1234 @ hello";
		int l=a.length();
		Str_Vowel v=new Str_Vowel();
		v.vowel(a);
	}
	public void vowel(String a)
	{
		int vowel=1;
		int consonant=1;
		for(int x=0;x<=a.length()-1;x++)
		{
			char letter = a.charAt(x);
			if(letter=='a'||letter=='e'||letter=='i'||letter=='o'||letter=='u')
			{
				vowel++;
			}
			else
			{
				consonant++;
			}
		}
		System.out.println(vowel);
	}
}