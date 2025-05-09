import java.util.Scanner;
Class Evil1
{
	public static void main(String[]args)
	{
		Scanner sc=new Scanner(System.in);
		int num=sc.nextInt();
		int p,sum,rem,temp=num;
		Number a= new Number();
		 a.evil();
		 a.checkevil();
  	void evil()
  	{
		for(int i=0;i<num;i++)
		{
	   	p=num*num;
	   	rem=p%10;
	   	sum+=rem;
	   	int t=p/10;	
		}
		System.out.println(temp+" Square  is : "+ p);
	}	
	String checkevil()
	{
		if(sum==num)
		{	
			System.out.println("EVIL NUMBER");
		}
		else
		{
			System.out.println("NOT EVIL NUMBER");
		}
	}
	}
}
	