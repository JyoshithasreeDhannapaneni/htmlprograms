class Array2
{
	public static void main(String[]args)	
	{			//0  1  2  3  4
		int a[]=new int[]{10,20,30,40,50};
				//20 30 40 50 10
		int b=a[0];
		for(int x=0;x<a.length;x++)
		{
			if(x<a.length-1)//0<3//1<3//2<3
			{ 
			  	a[x]=a[x+1];//a[0]=a[0+1]==>a[0]=a[1]//a[1]=a[2]//a[2]=a[3]
			}
		
		}
		a[a.length-1]=b;
		for(int x=0; x<a.length;x++)
		{
			System.out.println(a[x]);
		}	
	}
}