class Overloading
{
	public void add()
	{
		System.out.println("Default ");
	}
	public int add(int a)
	{
		return a;
	}
	public char add(char a)
	{
		return a;
	}
	public String add(String a)
	{
		return a;
	}
	public float add(float a)
	{
		return a;
	}
	public static void main(String[]args)
	{
		Overloading overloading;//reference Type
		overloading =new Overloading();//object Type
		System.out.println(overloading.add('A'));
	}
}