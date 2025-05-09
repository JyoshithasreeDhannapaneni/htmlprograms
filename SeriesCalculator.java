class SeriesCalculator
{
 	public static void main(String[]args)
	{
		SeriesCalculator c=new SeriesCalculator();
		c.calculateSum(10);
	}
 public void calculateSum(int num)//1+3+5+7+9+11
				 //  2  2  2  2
 {
	int a=1;//here "a" is the first term value
	int d=2;//common difference between the both terms
	System.out.println("Sums of the n terms is: ");
	/*int result=(num*(2*a+(num-1)*d))/2;
	System.out.println(result);*/
	System.out.println(num*(2*a(num-1)*d)/2);
 }
}