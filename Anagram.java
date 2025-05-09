import java.util.Arrays;
class Anagram
{
	public static void main(String[]args)
	{
		String s1="Silenft";
		String s2="liStefn";
		if(s1.length()==s2.length())
		{
			// here  I placed string into the char array format
			  char[] s=s1.toCharArray();
			  System.out.println(s);
			  char[] t=s2.toCharArray();
			  System.out.println(t);
			// after the placing the chararray format then i sorted into ascending order through that sorted array we can compared both char array are same then it will print anagram.    
			  Arrays.sort(s);
			  Arrays.sort(t);
			  System.out.println(s);
			  System.out.println(t);
			  System.out.println(Arrays.equals(s,t)?"Anagram":"Not an Anagram");
		}
		else
		{
			System.out.println("Not an Anagram");
		}
	}
}