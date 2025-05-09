import java.util.Scanner;
class Str_Equal
{
	public static void main(String []args)
	{
		Scanner sc=new Scanner(System.in);
		String a=sc.next();
		String b=sc.next();
		//String a="jyoshi";
		//String b="jyoshi";
		Str_Equal equal=new Str_Equal();
		equal.checkingequal(a,b);	
	}
	public void checkingequal(String a,String b)
	{
		System.out.println(a==b?"equal":"not equal");
		System.out.println("========================");
		System.out.println(a.equals(b)?"both are equal":"both are not equal");
	}

}