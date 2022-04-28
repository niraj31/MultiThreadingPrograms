package MultiThreadingPrograms;

public class ThreadLifeCycleEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Thread t1 = new Thread();
		System.out.println("State1: "+t1.getState());
		
		t1.start();
		System.out.println("State2: "+t1.getState());
		
		try
		{
			t1.sleep(1000);
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
		
		System.out.println("State3: "+t1.getState());
		

	}

}
