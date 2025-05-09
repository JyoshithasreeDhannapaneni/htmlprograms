class Application
{
public static void main(String[] args)
{
String companyname="flipkart";
System.out.println(companyname);
long couponcode=908;
System.out.println(couponcode);
int price=20;
System.out.println(price);
double quantity=22;
System.out.println(quantity);
byte deliverycharges=9;
System.out.println(deliverycharges);
short tax=(short)(12);
System.out.println(tax);
float totalprice=(float)((price*quantity)+deliverycharges+tax);
System.out.println(totalprice);
if (quantity>=22)
{
System.out.println("the quantity is eligible for mobile");
}
else
{
System.out.println("The quantity is not eligible for moblie");
}
String modeofpayment="upi";
System.out.println(modeofpayment);
String upi="googlepay";
System.out.println(upi);
String upiid="abc123476@axl";
System.out.println(upiid);
float discount=(float)(15/totalprice*100);
System.out.println(discount);
double finalprice=(totalprice-discount);
System.out.println(finalprice);
boolean deliverystatus=true;
System.out.println(deliverystatus);
String deliverydate="25feb";
System.out.println(deliverydate);

}
}