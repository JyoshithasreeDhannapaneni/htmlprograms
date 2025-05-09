class AddingArray
{
	public static void main(String[]args)
	{
		int a[]=new int[]{10,20,30,40,50};
		int b[]=new int[5];
		int y=0;
		for(int x=0;x<a.length;x++)
		{
			if(x==0)//0=0t
			{
				b[y]=a[x]+a[x+1];//b[0]=a[0]+a[0+1]==>10+20=30
				System.out.println("b["+y+"]="+b[y]);//30
				y++;
			}
			if(x>=0&&x<a.length-2)//0>=0t&&0<3t//1>=0&&1<3//2>0&&2<3
			{
				b[y]=a[x]+a[x+2];//b[1]=a[0]+a[0+2]==>10+30=40,a[1]+a[1+2]=20+40=60//a[2]+a[2+2]=20+50=80//
				System.out.println("b["+y+"]="+b[y]);//b[1]=40,b[2]=60,b[3]=80
				y++;
			}
			if(x==3)//3==3
			{
				b[y]=a[x]+a[a.length-1];//a[3]+a[4]==>40+50
				System.out.println("b["+y+"]="+b[y]);
			}
		}
	}
}