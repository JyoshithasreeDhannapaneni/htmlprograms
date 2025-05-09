class Leapyear
{
	public static void main(String[]args)
	{
		int year=20;
	if(year%4==0 && (year%100==0) || (year%400!=0))
	{
		System.out.println( year + " This is a Leap year");
	}
	else
	{
		System.out.println( year + " This is not a Leap year");
	}
	}
}