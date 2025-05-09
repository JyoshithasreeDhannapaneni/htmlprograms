class Armstrong
{
	static void checkArmstrong(int num,int rem)
	{
		int p=0;
		int temp=num;
		int count=0,sum=0;
		while(num!=0)
		{
			count++;
			num=num/10;
		}
		System.out.println(count);
		num=temp;
		while(temp!=0)
		{
			rem=temp%10;
			p=(int)Math.pow(rem,count);
			temp/=10;
			sum+=p;
		}
	    if(num==sum)
	    {
		System.out.println("Armstrong number");
	    }
	    else
	    {
		System.out.println("not Armstrong Number");
	    }
		
	}
	public static void main(String[]args)
	{
		Armstrong a=new Armstrong();
		a.checkArmstrong(153,0);
	}
}