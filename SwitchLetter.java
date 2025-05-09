class SwitchLetter
{
	public static void main(String[]args)
	{
		 int num1=13,num2=0;
		 char operation='%';
		 int result;
		switch(operation){
			case '+':
				System.out.println(result=num1+num2);
			break;
			case '-':
				System.out.println(result=num1-num2);
			break;
			case '/':
				 if(num2!=0)
		                 {	
			           System.out.println(" divisible");
				   System.out.println(result=num1/num2);
		                  }
		                  else
		                  {
			             System.out.println(" not divisible");
				     System.out.println(result=num1/num2);
		                  }
			break;
			case '%':
					 if(num2!=0)
		                 {	
			           System.out.println(" divisible");
				   System.out.println(result=num1%num2);
		                  }
		                  else
		                  {
			             System.out.println(" not divisible");
		                  }
			break;
			case '*':
				System.out.println(result=num1*num2);
			break;
		default :
				System.out.println("Invaild");
		break;}
	}
}