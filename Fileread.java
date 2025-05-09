import java.util.Scanner;
import java.io.FileNotFoundException;
import java.io.File;
class Fileread
{
	public static void main(String[]args)throws FileNotFoundException
	{
		File f= new File("C:\\Users\\prave\\OneDrive\\Desktop\\file read.txt");
		Scanner s=new Scanner(f);
		while(s.hasNextLine())
		{
			String s1=s.nextLine();
			System.out.println(s1.length());
			
		}
	}
}