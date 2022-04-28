package MultiThreadingPrograms;

class MultiThreading11 extends Thread
{
	public void run()
	{
		for(int i=1;i<=10;i++)
		{
			System.out.println(i);
		}
	}
}
class MultiThreading22 extends Thread
{
	public void run()
	{
		for(int i=1;i<=10;i++)
		{
			if(i%2==0)
			{
				System.out.println(i);
			}
		}
	}
}

class MultiThreading33 extends Thread
{
	public void run()
	{
		for(int i=0;i<=10;i++)
		{
			if(i%2!=0)
			{
				System.out.println(i);
			}
		}
	}
}



public class MultiThreading3 {

		public static void main(String[] args) {
			// TODO Auto-generated method stub
			MultiThreading11 m11 = new MultiThreading11();
			m11.start();
			try
			{
				m11.sleep(3000);
			}
			catch(Exception e) {System.out.println(e);}
			
			MultiThreading22 m22 = new MultiThreading22();
			m22.start();
			try
			{
				m22.sleep(3000);
			}
			catch(Exception e) {System.out.println(e);}
			
			MultiThreading33 m33 = new MultiThreading33();
			m33.start();
			try
			{
				m33.sleep(3000);
			}
			catch(Exception e) {System.out.println(e);}
		
	}

}
