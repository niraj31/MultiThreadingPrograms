package MultiThreadingPrograms;

class MultiThreading1 extends Thread
{
	public void run()
	{
		for(int i=0;i<5;i++)
		{
			System.out.println(i*i);
		}
	}
}
class MultiThreading2 extends Thread
{
	public void run()
	{
		for(int i=0;i<5;i++)
		{
			System.out.println(i*i*i);
		}
	}
}

public class MultiThreadingExample2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MultiThreading1 m1 = new MultiThreading1();
		m1.start();
		try
		{
			m1.sleep(3000);
		}
		catch(Exception e) {System.out.println(e);}
		
		MultiThreading2 m2 = new MultiThreading2();
		m2.start();
		try
		{
			m2.sleep(3000);
		}
		catch(Exception e) {System.out.println(e);}
	}

}
