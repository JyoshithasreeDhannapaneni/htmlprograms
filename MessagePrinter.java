import java.util.Scanner;
public class MessagePrinter 
{
  	Scanner sc= new Scanner(System.in);
   // Method to print the message
   public void printMessage(String name) 
   {
     System.out.println("Enter your name");
     name=sc.next();
     System.out.println("hello " + name);
   }
   public static void main(String[] args) {
       MessagePrinter m = new MessagePrinter();
       m.printMessage("hello");
   }
}