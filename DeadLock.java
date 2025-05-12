import java.util.ArrayList;
class Sample 
{
	 int Capacity=5;
		ArrayList<Integer> al=new ArrayList<>();

public synchronized void Produce(int item)
{
	while(al.size()==Capacity)
	{
		try
		{
			System.out.println("First "+Thread.currentThread().getName()+" is called");
			wait();
		}catch(InterruptedException e)
		{
			e.printStackTrace();
		}
	}
		al.add(item);
		System.out.println("item added is "+item);
	notify();
}
public synchronized void consume(int item)
{
	while(al.isEmpty())
	{
		try
		{
			System.out.println("First "+Thread.currentThread().getName()+" is called");
			wait();
		}catch(InterruptedException e)
		{
			e.printStackTrace();
		}
	}
		al.remove(0);
		System.out.println("item removed is "+item);
		notify();
}
}
class Intercommunicate extends Sample
{
	public static void main(String[] args) 
	{
		Sample s=new Sample();
	   Runnable r1=()->
	   {
		   for(int x=0;x<4;x++)
			   s.Produce(x);
	   };
	   Runnable r2=()->
	   {
		   for(int x=0;x<4;x++)
			   s.consume(x);
	   };
	Thread t1=new Thread(r1,"produce");
	t1.start();
	Thread t2=new Thread(r2,"cusome");
	t2.start();
	}
}