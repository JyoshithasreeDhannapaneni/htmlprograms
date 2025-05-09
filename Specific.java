class Specific
{
	public static void main(String[]args)
	{
		String c="ice";
		System.out.println(c);
		String a[]={"ice","water","cofee"};
		for(int x=0;x<a.length;x++)
		{
			System.out.println("a["+x+"]="+a[x]);
		}	
		if(c=="ice"|c=="water"|c=="cofee")
			{
				System.out.println("The Specific element is there ");
			}
			else
			{
				System.out.println("not there");
			}

	}
}