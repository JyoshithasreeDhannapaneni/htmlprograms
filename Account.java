import java.util.*;
class Card
{
	public static void main(String[]args)
	{
		Card c=new Card("1349-7858-0860","7656");
		c.getCardNumber();
		c.VerfiyPin("8765");
	}
	private String cardNumber;
	private String pin;
public Card(String cardNumber,String pin)
{
	this.cardNumber=cardNumber;
	this.pin=pin;
}
public String getCardNumber()
{
	return cardNumber;
}
public boolean VerfiyPin(String enteredPin)
{
	return this.pin.equals(enteredPin);
}
	public void setPin(String newPin)
	{
		this.pin=newPin;
	}
}
class Account
{
  private String accountNumber;
  private double balance;
public Account(String accountNumber,double Balance)
{
	this.accountNumber=accountNumber;
	this.balance=Balance;
}
public String getAccountNumber()
{
	return accountNumber;
}
public double getBalance()
{
	return balance;
}
public Boolean Withdrawal(double balance,double amount)
{
	if(amount>0&&amount<=balance)
	{
		this.balance-=amount;
		System.out.println("Successfully Withdrawal Amount"+balance);
		return true;
	}
	else if(amount<=0&& amount>balance)
	{
		System.out.println("Insufficient Balance");
		return false;
	}
	else
	{
		System.out.println("Invalid Balance");
		return false;
	}
}
public void PinChange()
{
	Scanner S=new Scanner(System.in);
	String otp="154678";
	String input=S.next();
	String newpin="9865";
	if(otp==input)
	{
		String oldpin=newpin;
		System.out.println("pin change Successfully");
	}
	else
	{
		System.out.println("pin chnage not Successfully");
	}
}
public static void main(String[]args)
{
	Account a=new Account("1082758350",5000);
	a.getAccountNumber();
	a.getBalance();
	a.Withdrawal(5000,3000);
	a.PinChange();
}
}