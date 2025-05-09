class Same
{
  public static void main(String[]args)
  {
   char b='B',c='b';
    int d=b+32;
    //int f=c-32;
    char e=(char)d;
    //char g=(char)f;
    System.out.println(e+" "+g);
   if(e==c)
   {
     System.out.println("The letters is same");
   }
    else
    {
      System.out.println("The letters is not same");
     }
  }
}