class Terinary_vowels
{
      public static void main(String[]args)
      {
          char ch='i';
          String res=(ch=='a' || ch=='e'|| ch=='i'|| ch=='o'|| ch=='u' ?  ch+ " is Vowels ": ch+ " is  Consents ");
          System.out.println(res);
      }
}