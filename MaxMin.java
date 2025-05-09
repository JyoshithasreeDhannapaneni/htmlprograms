class MaxMin
{
	public static void main(String[]args)
	{
		int num=233,rem=1,max=0,min=1,temp=num,count=0;
		while(num>0)
		{
			count++;
			num/=10;
		}
		num=temp;
		while(num>=0)
		{
		 rem=num%10;
		 while(rem>max)
		 {
			max=rem;
			num=num/10;
		 }
		}		
		int big=max;
		System.out.println("The max value of given number is : " +big);
		while(max<=min)
		{
			max=temp%10;
			min=rem;
			temp=temp/10;
		}
		int small=min;
			System.out.println(" Max value is "+big+ " X "+"Min value is "+small+" = "+(max*min));
	}
}