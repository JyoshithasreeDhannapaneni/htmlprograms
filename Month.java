class Month
{ 
  public static void main(String[]args)
  {
   int num=23;
   if(num==1|| num==3 || num==5 || num==7 || num==8  || num==9)
     System.out.println("31days are there in this month" );
   else if(num==2)
     System.out.println("28days / 29 days are there in this month");
   else if(num==4 || num==6 ||num==10 || num==11 ||num==12)
      System.out.println("30days are there in this month");
   else
     System.out.println(" Invaild month " + num);
  }
}