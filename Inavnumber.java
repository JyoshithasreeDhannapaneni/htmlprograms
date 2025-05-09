import java.util.Scanner;
class Inavnumber
{
	Scanner sc=new Scanner(System.in);
	int num=sc.nextInt();
	int temp,sum=0,rem=0,rem1=0,s,r,i,j=0;
	void digit()
	{ 
	   temp=num;
	   while(num>0)
	    {	
		rem1=num%10;//199%10=9/19%10=9/1%10=1
		s=s+rem1;//0+9=9,9+9=18,18+1=19
		num=num/10;//199/10=19,19/10=1,1/10=0
	    }
		 r=s;
		while(r>0)
		{
			rem=r%10;//19%10=9//1%10=1
			sum=sum+rem;//0+9=9//9+1=10
			r=r/10;//19/10=1,//1/10=0
		}
			while(sum>0)
			{
			i=sum%10;//10%10=0//1%10=1
			j=j+i;//0+0=0,//0+1=1
			sum=sum/10;//10/10=1/1/10=0
			System.out.println(j);
			}
	}
	void Checkinav()
	{
		if(j==1)
		{
		   System.out.println("Inav Number");
		}
		else
		{	
		   System.out.println("Not Inav Number");
		}
	}
	public static void main(String[]args)
	{
		Inavnumber a=new Inavnumber();
		a.digit();
		a.Checkinav();
	}
}