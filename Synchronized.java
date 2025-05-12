public class Synchronized
{
	public static void main(String[] args)
	{
		Example s=new Example();
		Thread t1=new Thread(s);
		t1.start();
		Thread t2=new Thread(s);
		t2.start();
		Thread t3=new Thread(s);
		t3.start();
	}
}
class Example extends Thread
{
	int count;
	public void run()
	{
		//System.out.println(Thread.currentThread().getName());
		/*for(int c=0;c<10;c++)
		{
			System.out.println(Thread.currentThread().getName()+" "+(++count));	
			System.out.println(Thread.currentThread().getName()+" "+(count++));
			System.out.println(Thread.currentThread().getName()+" "+(count--));
			System.out.println(Thread.currentThread().getName()+" "+(--count));
		}*/
		/*for(int x=0;x<9;x++)
		{
			System.out.println("hello"+(++count));
		}
		System.out.println(count);*/
		call();
	}
	public synchronized void call()
	{
		for(int x=0;x<7;x++)
		{
			System.out.println(Thread.currentThread().getName()+" "+(++count));
		}
		System.out.println(count);
	}
}
