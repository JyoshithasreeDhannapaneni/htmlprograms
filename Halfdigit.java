class Halfdigit
{
	public static void main(String[]args)
	{
		int num=12657,e_count=0,temp=num,s_firsthalf=0,s_secondhalf=0;
		while(num!=0)
		{
			e_count++;
			num=num/10;
		}
		num=temp;
			if(e_count%2==0)
			{
		 		int half=e_count/2;
		 		int pow=(int)Math.pow(10,half);
		 		System.out.println("The power of given number is: "+pow);
		 		s_firsthalf=num%pow;
			         s_secondhalf=num/pow;
				 System.out.println("first half is: "+s_firsthalf+" + "+"Second half is: "+s_secondhalf+" = " +(s_firsthalf+s_secondhalf));
			}
			else
			{
				s_firsthalf=num%10;
				s_secondhalf=num/10;
				System.out.println("last digit of odd number is: "+s_firsthalf +" + " + " remaining digit of given number is: "+s_secondhalf+ " = " +(s_firsthalf+s_secondhalf));
			}
				
	}

}