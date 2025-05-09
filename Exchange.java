class Exchange
{
	public static void main(String[]args)
	{
		char nu='A';
	if(nu>='A' && nu<='Z')
	{
		System.out.println((char)(nu+32) +" is a Small Letter");
	}
	else if(nu>='a' &&nu<='z')
	{
		System.out.println((char)(nu-32) + " is a Capital Letter");
	}
	else
	{
		System.out.println(nu +" Invaild");
	}
	}
}