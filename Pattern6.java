class Pattern6
{
	public static void main(String[]args)
	{
		Pattern6 p=new Pattern6();
		p.m1();
		System.out.println("-------------------");
		p.m2();
	}
public void m1()
{
	int r=3,c=4;
	for(int i=1;i<=r;i++)
	{
		char l=(char)('A'+i);
	   for(int j=1;j<=c;j++)
	   {
		System.out.print(l+" ");
		l++;
	   }
	System.out.println(" ");
	}
}
public void m2()
{
	int r=3,c=5;
	for(int i=0;i<=r;i++)
	{
           for(int j=1;j<=c;j++)
	   {
		char let=(char)('A'+i);
		System.out.print(let+" ");
		let++;
	   }
	 System.out.println(" ");
        }
}
}	