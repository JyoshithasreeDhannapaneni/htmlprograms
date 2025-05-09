class SecondMin
{
	public static void main(String[]args)
	{
		int min=Integer.MAX_VALUE;//123
		int SecondMin=Integer.MAX_VALUE;//1123
		int a[]={9,80,6,90,79,39,2};
		 int x=0;
		       /*0  1 2  3  4  5 6 
		for(x=0;x<=a.length-1;x++)/* 0<=6,1<=6,2<=6,3<=6,4<=6,5<=6,6<=6,7<=6f*/
		{
			if(min>a[x])/* 9<+187t,80<9f,6<9f,90<6f,79<6f,39<6f,2<6t*/
			{
				SecondMin=min;/* +1272,9,*/
				min=a[x];/* 9,*/
			}
			else if(min<a[x] && SecondMin>a[x])/*80>9f,6>9f,79<6f,39<6f*/
			{
				SecondMin=a[x];/*80*/
			}
		}
		System.out.println("First minimun element is:"+min);
		System.out.println("Second Minimum element is:"+SecondMin);
	}
}