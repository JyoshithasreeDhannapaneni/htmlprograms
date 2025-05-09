import java.util.Scanner;
class StringReserve
{
	public static void main(String[]args)
	{	
		Scanner sc=new Scanner(System.in);
		String a=sc.next();
		String b=" ";
		char ch;
		for(int i=0;i<a.length();i++)
		{
			ch=a.charAt(i);
			b=ch+b;//add the last letter to space
		}
		System.out.println(b);
	}
}