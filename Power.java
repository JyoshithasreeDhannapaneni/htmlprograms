import java.util.Scanner;
class Power
{	Scanner sc=new Scanner(System.in);
	int num=sc.nextInt();
	int pro=1,sum=0,rem1;
	void forLoop1()
	{
	while(num>0)
	{
		rem1=num%10;
		sum=sum+rem1;
		pro=pro*rem1;
		num=num/10;
	}
		System.out.println("The sum of the Given number is: "+sum);
		System.out.println("The product of the Given number is:"+pro);
	}
	void CheckPower()
	{
		if(sum==pro)
		{
		System.out.println("POWER NUMBER");
		}
		else
		{
		System.out.println("NOT POWER NUMBER");
		}
	}
	public static void main(String[]args)
	{
		Power p=new Power();
		p.forLoop1();
		p.CheckPower();
		
	}
}