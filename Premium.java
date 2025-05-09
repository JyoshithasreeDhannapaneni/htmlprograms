 class Premium
 {
     public static void main(String[]args)
           {
            int age=25;

            String  gender="male";
            int healthinsurens=50000;
	    String region="city";
            byte policyterm=3;
	    String health="Good";
            if(age>=25 && age<=35 && gender=="male" && region=="city" && health=="Good" )
	    {
		double policy_amount=0.004*10000;   
		System.out.println(policy_amount+ " is the policy amount ");             
		System.out.println("his policy amount cannot exceed 2 lakhs " + policy_amount);
	     }
	     else if( age>=25 && age<=35 && gender=="female" && region=="city" && health=="Good")
	     {
		double policy_amount=0.003*1000;
		System.out.println(policy_amount+ " is the policy amount ");
		System.out.println("her policy amount cannot exceed 1 lakh "+ policy_amount);
	      }
	      else if( age>=25 && age<=35 && gender=="male" && region=="village" && health=="poor")
	      {
                	double policy_amount=0.006*1000;
			System.out.println(policy_amount+ " is the policy amount "); 
			System.out.println("his policy amount cannot exceed 10000" );
	      }
	      else
	      {
			System.out.println("his/her not insured the policy amount");
	       }
	       }
}