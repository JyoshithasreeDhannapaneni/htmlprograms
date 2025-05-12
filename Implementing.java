public class Implementing 
{
	public static void main(String[] args) 
	{
		Demo d=new Demo();
		Thread t1=new Thread(d,"Jyoshi");
		t1.start();
		Thread t2= new Thread(d,"Swarna");
		t2.start();
		Thread t3= new Thread(d,"Asiya");
		t3.start();
		Thread t4=new Thread(d,"parvathi");
		t4.start();
		for(int m=0;m<10;m++)
		{
			System.out.println("Main is a Thread");
		}
	}
}
class Demo implements Runnable
{
	@Override
	public void run()
	{
		for(int t=0;t<10;t++)
		{
			System.out.println(Thread.currentThread().getName()+" " +t);
		}
	}
}
