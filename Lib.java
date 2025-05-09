class Lib
{
  public static void main(String[]args)
  {
   int days=55;
   int bookprice=500;
   int perday=20;
   if(days<0)
     System.out.println( days + " Invaild");
  else if(perday==15)
   { 
      int book=perday*bookprice*days;
      System.out.println( book+" They need to pay total price of Book");
   }
   else if(days>=20)
   {
     int book= bookprice*perday*days;
     System.out.println( book +" They need to pay price ");
   }
   else if(days<25)
   {
     System.out.println( days + "They no need to pay money");
   }
  }
  
}