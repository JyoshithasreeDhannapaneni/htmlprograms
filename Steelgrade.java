class Steelgrade
{
	public static void main(String[]args)
	{
		int hardness=169;
 		double carbon=0.8;
		int Tensile=86690;
	if(hardness>50 && carbon<0.7 && Tensile<5600)
	{
		System.out.println("Grade is 10");
	}
	else if(hardness>50 && carbon<0.7)
	{
		System.out.println("Grade is 9");
	}
	else if(carbon<0.7 && Tensile<5600)
	{
		System.out.println("Grade is 8");
	}
	else if(hardness>50 && Tensile<5600)
	{
		System.out.println("Grade is 7");
	}
	else if(hardness>50 || carbon<0.7 || Tensile<5600)
	{
		System.out.println("Grade is 6");
	}
	else
	{
		System.out.println("Grade is 5");
	}
	}
}
 