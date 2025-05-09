import java.util.Scanner;
class Array
{
	public static void main(String[]args)
	{
		Scanner sc=new Scanner(System.in);
		int arr[]=new int[5];
		int size =arr.length;
		arr[0]=sc.nextInt();
		arr[1]=sc.nextInt();
		arr[2]=sc.nextInt();
		arr[3]=sc.nextInt();
		arr[4]=sc.nextInt();
		System.out.println(arr[2]);
		System.out.println(arr[size-1]);
		System.out.println(size);
	}
}
