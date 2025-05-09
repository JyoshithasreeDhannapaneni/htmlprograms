import java.util.Scanner;
class Str_Unique
{
	public static void main(String []args)
	{
		Scanner sc= new Scanner(System.in);
		String s=sc.next();
		String s1="";
		Str_Unique unique=new Str_Unique();
		unique.Unique(s);
		unique.Duplicate(s,s1);
	}
	public void Unique(String s)
	{
		for(int x=0;x<=s.length()-1;x++)
		{
			char ch=s.charAt(x);
			int f=s.indexOf(ch);
			int l=s.lastIndexOf(ch);
			if(f==l)
			{
				System.out.println(" unique are "+ch);
			}
			
		}
		
	}
	public void Duplicate(String s,String s1)
	{
		for(int x=0;x<=s.length()-1;x++)
		{
			char letter=s.charAt(x);
			int f=s.indexOf(letter);
			int l=s.lastIndexOf(letter);
			if(f!=l)
			{
				if(s1.indexOf(letter)==-1)
				{
					s1=s1+letter;
					System.out.println("The Duplicate are : "+s1);
				}	
			}
		}

	}
}