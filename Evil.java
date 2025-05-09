import java.util.Scanner;
class Evil
{
	 public static void main(String[]args)
	{
		 Number e= new Number();
		 e.evil();
		 String result= e.checkevil();
		 System.out.println(result);
	}
}
class Number
{
	Scanner sc=new Scanner(System.in);
	int num=sc.nextInt();
	int p,sum,rem,temp=num;
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
			return "EVIL NUMBER";
		}
		else
		{
			return "NOT EVIL NUMBER";
		}
	}
}