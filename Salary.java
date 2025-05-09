class Salary
{
public static void main(String[]args)
{
String employename="Murali";
int basicsalary=20000;
double dearnessallowance=0.4*basicsalary;
double houserent=0.2*basicsalary;
float grosssalary=(float)(basicsalary+dearnessallowance+houserent);
System.out.println("The Name of the Employee="+employename);
System.out.println("The basic Salary="+basicsalary);
System.out.println("The Dearness Allowance of Employee="+dearnessallowance);
System.out.println("The House Rent of Employee="+houserent);
System.out.println("The Gross Salary of Employee="+grosssalary);
}
}