class Employeee
{
	public static void main(String[]args)
	{
		Employeee e=new Employeee(1,"Rani"," IT",35000.09);
		Employeee e1=new Employeee(1,"aaa"," Hr",35000.09);
		Employeee e2=new Employeee(1,"and"," develop",35000.09);
		System.out.println(e);
		System.out.println(e1);
		System.out.println(e2);
		
	}

		int e_id;
		static String ename;
		String edep;
		double Salary;
Employeee(int e_id,String ename,String edep,double Salary)
{
	this.e_id=e_id;
	this.ename=ename;
	this.edep=edep;
	this.Salary=Salary;
}
public String toString()
{
 return " employee id "+e_id+" employe name "+ename+" employe deparment "+edep+" employe salary "+Salary; 
}
}0