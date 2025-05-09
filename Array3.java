import java.util.Scanner;
class Array3
{
	public static void main(String[]args)
	{
		Scanner s=new Scanner(System.in);
		int a[][]=new int [s.nextInt()][];		
		for(int r=0;r<a.length-1;r++)
		{
			System.out.println("Enter row "+r+"Column Size ");
			a[r]=new int[s.nextInt];
		}
		System.out.println("Array Element are: ");
			for(int r=0;c<a.length-1;r++)
			{
				for(int c=0;c<=a[r].length-1;c++)
				{
					a[r][c]=s.nextInt();
					System.out.println(a[r][c]);
				}	
			System.out.println
			}
		}	
	}
}