import java.util.Scanner;
class Str_Panagram
{
	public static void main(String[]args)
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("enter");
		String a=sc.nextLine();
		//String a="A Quick Brown fox jumps over the lazy dog";
		Str_Panagram panagram=new Str_Panagram();
	     	//panagram.checkingpanagramfor_captial(a);
	     	panagram.checkingpanagramfor_small_letter(a);
	}
	public void checkingpanagramfor_captial(String a)
	{
		for(char x='A';x<='Z';x++)
		{
			int count=0;
			for(int y=0;y<=a.length()-1;y++)
			{
				char ch=a.charAt(y);
	.
			if(ch==x)
				{
					count++;
				}
			}
			if(count==0)
			{
				System.out.println(x);
			}
		}
	}
	public void checkingpanagramfor_small_letter(String a)
	{
		for(char x='a';x<='z';x++)
		{
			int count=0;
			for(int y=0;y<=a.length()-1;y++)
			{
				char letter=a.charAt(y);
				if(letter==x)
				{
					count++;
				}
			}
			if(count==0)
			{
				System.out.println(x);
			}
		}
	}
}