class Extract
{
	public static void main(String[]args)
	{
		int num=756,rem=0,temp=num,sum=0,count=0,pro=1;
		while(num>0)
		{
			rem=num%10;
			count++;
			num=num/10;
			sum=sum+rem;
			pro=pro*rem;
		}
		System.out.println("The Sum of the digits is : " +sum + "\n The count of the digits is: " +count+ "\nThe Product of the digits is : "+pro);	
	}
	
}
