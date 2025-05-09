import java.util.Scanner;
class Str_World
{
	public static void main(String[]args)
	{
		Scanner sc=new Scanner(System.in);
		String s=sc.nextLine();
		String t[]=s.split(sc.nextLine());
		for(String a:t)
		{
			System.out.println(a);
		}
	}
}
