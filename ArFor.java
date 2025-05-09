import java.util.Scanner;
class ArFor
{
	public static void main(String[]args)
	{	
		Scanner s=new Scanner(System.in);
		int arr[]=new int[6];
		for(int i=0;i<arr.length-1;i++)
		{
			arr[i]=s.nextInt();
			System.out.println(arr[i]);
		}
	}
}