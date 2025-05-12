public class Anonimas 
{
	public static void main(String[] args)
	{	
		Runnable r=new Runnable()
		{
			public void run()
			{
				for(int x=0;x<7;x++)
				{
					System.out.println(Thread.currentThread().getName());				
				}
			}
		};
		Thread t1=new Thread(r,"joshi");
		Thread t2=new Thread(r,"jeswi");
		t1.start();
		t2.start();

	}

}
