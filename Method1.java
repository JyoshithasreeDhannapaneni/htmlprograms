class Method1 extends Signature
{
	public static void main(String[]args)
	{
		int a;
		int b;
		Method1 method=new Method1();
		method.sub(40,30);
	}
	void sub(int a,int b)
	{
		System.out.println(a-b);
	}
}
class Signature
{
	void sub(int a,int b)
	{
		System.out.println(a+b);
	}
}