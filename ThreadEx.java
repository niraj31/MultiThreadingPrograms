package MultiThreadingPrograms;

class ThreadDemo extends Thread
{
	public void run()
	{
		System.out.println("Thread is Running.");
	}
}

public class ThreadEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ThreadDemo td = new ThreadDemo();
		td.start();
	}

}