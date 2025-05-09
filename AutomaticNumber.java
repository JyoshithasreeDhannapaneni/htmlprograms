import java.util.Scanner;
class AutomaticNumber
{
	Scanner sc=new Scanner(System.in);
	int num=sc.nextInt();
	int s,rem,p;
	void number()
	{
	 for(int i=1;i<num;i++)
	{
	   p=num*num;
	   s=p%100;
	   rem=s*100;
	}
	 System.out.println(s);
	}
	void checkAutomatic()
	{
		if(s==num)
		{
			System.out.println("Automatic Number");
		}
		else
		{
			System.out.println("Not Automatic Number");
		}
	}
	public static void main(String[]args)
	{
		AutomaticNumber a=new AutomaticNumber();
		a.number();
		a.checkAutomatic();
	}
}