class Mark
{
  public static void main(String[]args)
  {
   String name="Amrutha";
   int sub1=75,sub2=56;
   int total_marks=sub1+sub2;
   double max=200;
   double  percentage=total_marks/max*100;
   if(percentage==90)
    System.out.println( percentage + "The Grade is A+");
   else if(percentage==80)
     System.out.println( percentage + "The Grade is A");
   else if(percentage>=70)
     System.out.println( percentage + "The Grade is B");
   else if(percentage>=60)
     System.out.println( percentage + "The Grade is B+");
   else 
   System.out.println( percentage + " fail");
  }
}