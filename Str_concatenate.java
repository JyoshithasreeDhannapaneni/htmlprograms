class Str_concatenate
{
	public static void main(String []args)
	{
		String a="jyoshitha";
		String b="";
		Str_concatenate con=new Str_concatenate();
		con.concatenate(a,b);	
	}
	final void concatenate(String a,String b)
	{
		System.out.println(" using concatenate method for string");
		b=a+b.concat("sree");
		System.out.println(b);
		System.out.println("=========================="+"\n"+"not using concatenate method for string");
		b=a+"Sree";
		System.out.println(b);
	}
}