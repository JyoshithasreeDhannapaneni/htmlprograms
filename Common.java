class Common
{
	public static void main(String[]args)
	{
		int n1=24,n2=56;
		int start=1;
		while(start<n1/2&&start<n2/2)
		{
			if(n1%start==0 &&n2%start==0)
			{  			
				System.out.println(start);
			}
			start++;
		}	
	}
}