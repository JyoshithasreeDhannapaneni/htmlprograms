class Fact
{
	public static void main(String[]args)
	{
		int num=17,max=0,count=0,pro=1,sum=0;
		int start=1,end=num;
		while(start<17)
		{
		  if(num%start==0)
		  {
			max=start;
			count++;
			pro*=start;
			sum+=start;
		  }
			start++;
		}
			System.out.println("The highest number = "+max);
			System.out.println("The count of number = "+count);
	                System.out.println("The product of number = "+pro);
			System.out.println("The Sum of  number = "+sum);

	}
}