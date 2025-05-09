class Small
{
	public static void main(String[]args)
	{
		char num='*';
	if(num>='A'&&num<='Z')
		System.out.println(num + " Capital Letters ");
	else if(num>='a'&&num<='z')
	{
		System.out.println(num + " Samll Letter ");
	}
	else if(num>=0&&num<=9)
	{
		System.out.println(num+ " digit ");
	}
	else if(num==' ')
	{
 		System.out.println( num + " Space ");
	}
	else
	{
		System.out.println(num + " Symbol ");
	}
	}
}