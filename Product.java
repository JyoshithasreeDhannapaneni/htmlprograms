class Product
{
	public static void main(String[]args)
	{
		String productname="mobile";
		System.out.println("The product Name=" +productname);
		String productcode="127";
		System.out.println("The product Code=" +productcode);
		int productprice=250000;
		System.out.println("The product Price=" +productprice);
		int productquantity=56;
		System.out.println("The product Quantity=" +productquantity);
		int product_total=productprice*productquantity;
		System.out.println("The product total=" +product_total);
		double discount=0;
		if(product_total>1000&&product_total<2000)
		{
			 discount=10.0/100*product_total;
			double finaltotal=productprice-discount;
			double tax=18.0/100*finaltotal;
			double bill=(finaltotal+tax);
			System.out.println("The product discount = "+ discount);
			System.out.println("The finalprice of product = "+ finaltotal);
			System.out.println("The product tax = "+tax);
			System.out.println("The bill of product = "+ bill);
		}
		else if(product_total>2000&&product_total<3000)
		{
			 discount=15.0/100*product_total;
			double finaltotal=productprice-discount;
			double tax=18.0/100*finaltotal;
			double bill=(finaltotal+tax);
			System.out.println("The product discount = "+ discount);
			System.out.println("The finalprice of product = "+ finaltotal);
			System.out.println("The product tax = "+tax);
			System.out.println("The bill of product = "+ bill);
		}
		else if(product_total>3000&&product_total<4000)
		{
			discount=20.0/100*product_total;
			double finaltotal=productprice-discount;
			double tax=18.0/100*finaltotal;
			double bill=(finaltotal+tax);
			System.out.println("The product discount = "+ discount);
			System.out.println("The finalprice of product = "+ finaltotal);
			System.out.println("The product tax = "+tax);
			System.out.println("The bill of product = "+ bill);
		}
		else
		{
			discount=30.0/100*product_total;
			double finaltotal=productprice-discount;
			double tax=18.0/100*finaltotal;
			double bill=(finaltotal+tax);
			System.out.println("The product discount = "+ discount);
			System.out.println("The finalprice of product = "+ finaltotal);
			System.out.println("The product tax = "+tax);
			System.out.println("The bill of product = "+ bill);
		}

	}
}