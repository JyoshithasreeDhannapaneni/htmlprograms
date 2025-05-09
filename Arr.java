class Arr
{
	public static void main(String[]args)
	{
		
		Arr arr=new Arr();
		arr.add((short)564);
		
	}
void add()
{
	System.out.println("The default value ");
}
void add(byte x)
{
	System.out.println("The byte value is : " +x);
}
void add(int x)
{
	System.out.println("The integer value : "+x);
}
void add(short x)
{
	System.out.println("The short value is : " +x);
}
void add(Boolean x)
{
	System.out.println("The value of boolean is : "+x);
}
void add(String x)
{
	System.out.println("The value of String is : "+x);
}
}