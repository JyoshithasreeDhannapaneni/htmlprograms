class ArrayNumber
{
	public static void main(String[]args)
	{
		int a[]=new int[]{10,20,30,40};
		int search=20;
		int count=0;
		ArrayNumber array=new ArrayNumber();
		array.linearSearch(a,10);
	}
}
int[] linearSearch(int a[],int search)
{
	for(int x=0;x<a.length;x++)
	{
		if(search==a[x])
		{
			System.out.println("The element is Found"+x);
			count++;
			break;
		}
	}
String else()
{
		if(count==0)
		{
		}
		return "not found";
}