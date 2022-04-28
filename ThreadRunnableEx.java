package MultiThreadingPrograms;

class ThreadRunnableExample implements Runnable //since java don't support multiple inheritance,
//in case if we use multiple classes, it will give error. So we can use Runnable interface.
{
	public void run()
	{
		for(int i=1;i<=5;i++)
		{
			System.out.println(i);
		}
	}
}

public class ThreadRunnableEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ThreadRunnableExample tre = new ThreadRunnableExample();
		Thread t = new Thread(tre); //since runnable interface doesn't have start 
		//method and thread has it, we need to create thread object in order to use start method.
		t.start();

	}

}
