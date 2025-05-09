class Trenary_month
{
    public static void main(String[]args)
    {
          int month=1;
          String mon=(month==1||month==3||month==5||month==7||month==8||month==10||month==12 ? month+" is 31days" : month==4||month==6||month==9||month==11? month+" is 30days " :month==2? month+ " is 28\29 days" :month+ "is Invaild");
          System.out.println(mon);
    }
}