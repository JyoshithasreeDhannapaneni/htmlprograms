class Retriment
{
     public static void main(String[]args)
     {
         int age=6;
     if(age>=59)
      {
        String Gender="female";
       if(Gender=="female")
          System.out.println("The retriment amount  provide for female  Senior Citizen is 30000 per month");
      else
          System.out.println("The retriment amount provide for male Senior Citizen  is 35000 per month");
        }
      else if(age>=18)
	{
            String qualification="UG";
        if(qualification=="UG")
            System.out.println("The scholar ship amount for under Graduate person is 30000 per year");
        else if(qualification=="PG")
            System.out.println("The scholar ship amount for Post Graduate person is 40000 per year");
	}
        else 
            System.out.println("The scholar ship and retriment not provided for minor");
        } 
}