class Tersqrt
{
  public static void main(String[]args)
  {   
    double n=25,p=0;
    double res=Math.sqrt(n);
    String t=(n%res==0?"is eligible":"ne");
    System.out.println("Enter the t="+t);
    System.out.println("t=n%res==0?true:false"+p);
  }
}