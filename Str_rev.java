class Str_rev
{
	public static void main(String []args)
	{
		String s1="hello";
		String rev="";
		Str_rev r=new Str_rev();
		r.checking_reverse(s1,rev);
	}
	final void checking_reverse(String s1,String rev)
	{
		/*for(int x=s1.length()-1;x>=0;x--)
		{
			rev=rev+s1.charAt(x);
		}
		System.out.println(rev);*/
		for(int x=0;x<=s1.length()-1;x++)
		{
			rev=s1.charAt(x)+rev;
		}
		System.out.println(rev);
	}
}