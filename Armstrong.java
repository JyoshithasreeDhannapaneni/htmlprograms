class Armstrong
{
	public static void main(String[]args)
	{
		int num=7,count=0,temp=num,rem=0,sum=0,pow=0;
		while(num!=0)
		{
		  count++;
		  num/=10;
		 }
		num=temp;
		while(num!=0)
		{
		 rem=num%10;
		 pow=(int)Math.pow(rem,count);
		 System.out.println("the result : "+rem+"\n count: "+count+"\n power: "+pow);
		 num/=10;
		 sum+=pow;
		 }
		System.out.println(sum);
		System.out.println(sum==temp?temp+"is armstrong number ":temp+" is not a armstrong number"); 
	}
}