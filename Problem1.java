class Problem1
{
	public static void main(String[]args)
	{
		int num=120000,rev1=0,rev2=0,rem2=0,rem1=0,c1=0,c2=0,temp=num,a,c;
		while(num!=0)
		{
			c1++;
			num/=10;
		}
		num=temp;
		while(num>0)
		{
			rem1=num%10;
			rev1=rev1*10+rem1;
			num=num/10;
		}
			System.out.println(rev1);
		a=rev1;
		while(rev1>0)
		{
			c2++;
			rev1/=10;
		}
		rev1=a;
		while(a>0)
		{
			rem2=a%10;
                        switch(rem2)
			{
			case 0:
				System.out.println("Zero");
				break;
               		case 1:
				System.out.println("One");
			break;
		        case 2:
				System.out.println("Two");
		        break;
			case 3:
				System.out.println("Three");
			break;
			case 4:
				System.out.println("Four");
			break;
			case 5:
				System.out.println("Five");
			break;
               		case 6:
				System.out.println("Six");
			break;
			case 7:
				System.out.println("Seven");
			break;
			case 8:
				System.out.println("Eight");
			break;
			case 9:
				System.out.println("Nine");
			break;
			}
			rev2=rev2*10+rem2;
			rev1/=10;
			}
		c=c1-c2;
		while(c>0)
		{
			
		    rev2=rev2*10;
		    int t=0;
			t=rev2%10;
		switch(t)
		{
		case 0:
				System.out.println("Zero");
				break;
                case 1:
				System.out.println("One");
		break;
		case 2:
				System.out.println("Two");
		break;
		case 3:
				System.out.println("Three");
		break;
		case 4:
				System.out.println("Four");
		break;
		case 5:
				System.out.println("Five");
		break;
                case 6:
				System.out.println("Six");
		break;
		case 7:
				System.out.println("Seven");
		break;
		case 8:
				System.out.println("Eight");
		break;
		case 9:
				System.out.println("Nine");
		break;
		}
		c--;
		}	
		System.out.println(rev2);		
	}
}