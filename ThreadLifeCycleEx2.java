package MultiThreadingPrograms;

class ThreadLCEx implements Runnable
{
	private String threadName;
	private Thread t;
	ThreadLCEx(String name)
	{
		threadName=name;
		System.out.println("Creating: "+threadName);
	}
	public void run()
	{
		System.out.println("Creating: "+threadName);
		try
		{
			for(int i=5;i>=1;i++)
			{
				System.out.println("Thread: "+threadName);
				Thread.sleep(1000);
			}
		}
		catch(Exception e)
		{
			System.out.println("Thread: "+threadName+"Interrupted");
		}
		
		System.out.println("Thread: "+threadName+"Exiting");
	}
	public void start()
	{
		System.out.println("Starting : "+threadName);
		if(t==null)
		{
			t=new Thread(this, threadName);
			t.start();

		}
		
	}
}

public class ThreadLifeCycleEx2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ThreadLCEx th = new ThreadLCEx("Object 1");
		th.start();

	}

}
