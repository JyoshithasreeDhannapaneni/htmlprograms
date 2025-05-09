class Numsame
{
  public static void main(String[]args)
  {
    int num1=56;
    int num2=1;
  if(num1==num2)
   System.out.println("both are same");
  else if(num1>num2)
    System.out.println("num1 is greater than num2");
   else
    {
      System.out.println("num2 is greater than num1"); 
    } 
     System.out.println((num1==num2)?"both are same":(num1>num2)?"num1 is greater":"num2 is greater");   
     }
}