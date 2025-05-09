import java.util.Scanner;
class Calculator
{
	
	public int calculatesum(int num1,int num2)
	{
		return num1+num2;
	}
	public int calculatedifference(int num1,int num2)
	{
		return num1-num2;
	}
public static void main(String[]args)
{
	Scanner sc=new Scanner(System.in);
	int num1=sc.nextInt();
	int num2=sc.nextInt();
	Calculator c=new Calculator();
	int sum=c.calculatesum(num1,num2);
	int difference=c.calculatedifference(num1,num2);
	System.out.println("Sum: "+sum);
	System.out.println("Difference: "+difference);
}
}