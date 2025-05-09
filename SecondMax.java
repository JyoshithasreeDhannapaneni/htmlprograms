class SecondMax
{
	public static void main(String[]args)
	{
		int max=Integer.MIN_VALUE;
		int Secondmax=Integer.MIN_VALUE;
		int a[]={10,90,78,56,85,65,94};
		       /* 0  1  2  3  4  5  6*/
		for(int x=0;x<=a.length-1;x++)/*0<=6,1<=6,2<=6,3<=6,4<=6,5<=6,6<=6,7<=6f*/
		{
			if(a[x]>max)/*a[0]>-233,a[1]90>10,a[2]78>90fa[3]56>90f,a[4]85>90f,a[5]65>90f a[6]94>90t*/
			{
				Secondmax=max;/*second=-233,10,90*/
				max=a[x];/*10,90,94*/
			}
			else if(a[x]<max&&a[x]>Secondmax)/*78<90t&&78>10,56<90t&&56>78f,85<90t&&85>78,65<90t&&65>85f*/
			{
				Secondmax=a[x];//78,85
			}
		}
		System.out.println("The Firstmax element is :"+max);
		System.out.println("The Secondmax element is:"+Secondmax);
	}
}