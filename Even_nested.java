class Even_nested
{
     public static void main(String[]args)
     {
      int num=76;
      if(num%2==0)
      {
         double sqrt=Math.sqrt(num);
      if(num%sqrt==0)
        System.out.println(" The number is even and it is prefect square number");
      else 
           System.out.println(" The number is even and it is not a prefect square number");
       }   
       else
        {
          int lastdigit=num%10;
        if(lastdigit%5==0)
            System.out.println(" The last digit number is divide by 5");
        else
            System.out.println("The last digit number is not divide by 5");
        }
        }
}