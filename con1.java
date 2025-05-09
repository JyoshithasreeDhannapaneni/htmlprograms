class con1 
{
	String a,b;
	con1(String c,String d)//Local Variables
	{
		a=c;//global instances
		b=d;
	}
	con1()
	{
		a="Coding";
		b="Hub";
	}
	void print()
	{
		System.out.println(a+ " "+b);
	}
	public static void main(String[] args) 
	{
		con1 c=new con1();
		con1 c1=new con1("hi","Work");//instance variable
		c.print();
		c1.print();
	}

}