package MultiThreadingPrograms;

public class SynchronizedEx extends Thread{
	
	synchronized public void run()
	{
		for(int i=0;i<5;i++)
		{
			System.out.println(i);
		}
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		SynchronizedEx me = new SynchronizedEx();
		me.start();

		
		SynchronizedEx me1 = new SynchronizedEx();
		me1.start();

		
		SynchronizedEx me2 = new SynchronizedEx();
		me2.start();
	}

}
