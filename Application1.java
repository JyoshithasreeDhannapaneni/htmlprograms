import java.util.Scanner;
class Application1
{
	private String password="1654";
	public static void main(String[]args)
	{
		Scanner s=new Scanner(System.in);
		System.out.println("ATM MACHINE");
		System.out.println("Insert  your debit card/credit card");
		String HolderName="ABGCHUJNKK";
		String AccountNumber="100082082057";
		Application1 a=new Application1();
		a.setpassword("1234");
		a.getpassword();
		double amount=s.nextInt();
		a.withdrawal(s.next(),s.next());
	}
public String setPassword(String Password)
{
	this.password=password;
}
public String getPassword()
{
	return password;
}
public void withdrawal(double amount,String input)
{
	if(input==Current)
	{
		System.out.println("Enter Amount :"+amount);
		if(password==s.next())
		{
			System.out.println("Successfully Completed Transaction");
			if(balance>amount&&balance==amount)
			{
			System.out.println("Successfully Withdrawal Amount"+s.nextInt());
			}
			else
			{
			System.out.println("Insufficent Balance in your Account");
			}
		}
		else
		{
		System.out.println("Not Successfully Completed Transaction");
		}
	}
	else
	{
		System.out.println("Enter Amount :"+amount);
		if(password==s.next())
		{
			System.out.println("Successfully Completed Transaction");	
			if(balance>amount&&balance==amount)
			{
			System.out.println("Successfully Withdrawal Amount"+s.nextInt());
			}
			else
			{
			System.out.println("Insufficent Balance in your Account");
			}
		}
		else
		{
		System.out.println("Not Successfully Completed Transaction");
		}
	}		
}
public void Pinchange()
{
	System.out.println("Enter phone number: "+s.nextInt());
	if(number==number)
	{
		System.out.println("Enter your OTP of registered number: "+s.nextInt());
		if(otp==valid)
		{
			String newPin=s.next();
	  		System.out.println("Enter your new Pin : "+newPin);
			System.out.println("Enter your Confirmation pin : "+newPin);
			
		if(newpin==password)
		{
		System.out.println("Successfully Change Pin");
		}
		}
	}
	else
	{
		System.out.println("exist the Transaction");
	}
}
public void BalanceEnquiry(String input,double balance)
{
	
	if(input==Current)
	{
		if(pin==password)
		{
		System.out.println("Current Account Balance Enquiry : "+balance);
		}
	}
	else
	{
		if(pin==password)
			System.out.println("Saving Account Balance Enquiry : "+balance);
	}
}
public void MiniStatement(String password)
{
	String s;
	if(pin==password)
	{
		s=s+transaction;
	}
	System.out.println(s);
	System.out.println("The balance amount in card : "+balance);
}
}