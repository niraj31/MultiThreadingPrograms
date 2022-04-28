package MultiThreadingPrograms;

public class MultiThreadingEx extends Thread{
	
	public void run()
	{
		for(int i=0;i<5;i++)
		{
			System.out.println(i);
		}
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		MultiThreadingEx me = new MultiThreadingEx();
		me.start();
		try
		{
			me.sleep(3000);
		}
		catch(Exception e ) {System.out.println(e);}
		
		MultiThreadingEx me1 = new MultiThreadingEx();
		me1.start();
		try
		{
			me1.sleep(3000);
		}
		catch(Exception e ) {System.out.println(e);}
		
		MultiThreadingEx me2 = new MultiThreadingEx();
		me2.start();
		try
		{
			me2.sleep(3000);
		}
		catch(Exception e ) {System.out.println(e);}
	}

}
