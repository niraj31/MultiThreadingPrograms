package MultiThreadingPrograms;
public class ThreadNameEx extends Thread{
	public void run()
	{
		System.out.println(Thread.currentThread().getName());
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ThreadNameEx tn1 = new ThreadNameEx();
		ThreadNameEx tn2 = new ThreadNameEx();
		
		System.out.println("Name of Thread 1 "+tn1.getName());
		System.out.println("Name of Thread 2 "+tn2.getName());
		
		tn1.start();
		tn2.start();
		
		tn1.setName("Thread11");
		tn2.setName("Thread22");
		
		System.out.println("Name of Thread 1 "+tn1.getName());
		System.out.println("Name of Thread 2 "+tn2.getName());
	}

}
