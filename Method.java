class Method
{
	public static void main(String[]args)
	{
		int a;
		int b;
		String c;
		Method method=new Method();
		method.add(20,30,"hello");
	}
 public void add()
  {
	int a=10;
	 int b=20;
	String c="hi";
  }
   void add(int a,int b,String c)
   {
	
	System.out.println(a+b+" "+c);
	
   }
   void add(int a,String c)
  {
		System.out.println(a+" "+c);
  }
}