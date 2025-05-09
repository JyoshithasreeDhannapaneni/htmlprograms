class Age
{
  public static void main(String[]args)
  {
   int age=962;
  if(age<0)
  {
   System.out.println( age + "invalid age of person and negative");
  }
  else if(age<9)
  {
    System.out.println( age + " kid ");
  }
  else if(age<=17)
  {
     System.out.println( age + "minor");
  }
  else if(age<=60)
    {
       System.out.println( age + "major");
    }
  else if(age<=100)
   {
      System.out.println( age + " Senior Cityizen Person");
   }
  else 
    {
    System.out.println( age + "Over the age of person");
    }
  }
} 