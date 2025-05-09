//import java.util.Arrays;
class Str_rotation
{
	public static void main(String []args)
	{
		//Scanner sc=new Scanner(System.in)
		//String s1=next();
		//String s2=next();
		 String s1="abcd";
		 String s2="";
		 char t[]=s1.toCharArray();
		int r=2;
		for(int y=0;y<=r;r++)
		{
		    int t=s1.charAt(0);
		    for(int x=s1.length()-1;x>0;x--)
		     {
			s2+=s1.charAt(x-1);
		     }
		     s2=t;
		 }
		if(s2==s1)
		{
			System.out.println("equal");
		}	
		else
		{
			System.out.println("not equal");
		}
	}
}