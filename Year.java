class Year
{
	public static void main(String[]args)
	{
		int days=456;
		int year=days/365;
		int i= ((int)days%365);
		int m=(int)i/31;
		int d=(int)m%31;
		System.out.println(year + " year " + m +" months "+ d + " days " );
	}
}