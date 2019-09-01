package Array;
class A extends Thread
{
	public void run()
	{
		System.out.println("thread A started");
		for(int i=1;i<=5;i++)
		{
			if(i==1) //yield();
			System.out.println("\t from thread A:i="+i);
		}
		System.out.println("exit from A");
	}
}
class B extends Thread
{
	public void run()
	{
		System.out.println("Thread B started");
		for(int j=1;j<=5;j++)
		{
			System.out.println("\t from thread B:j="+j);
			//if(j==3) stop();
		}
		System.out.println("exit from B");
	}
}
class C extends Thread
{
	public void run()
	{
		System.out.println("Thread C started");
		for(int k=1;k<=5;k++)
		{
			System.out.println("\n from thread C:k="+k);
		/*	if(k==1)
				try
			{
					sleep(1000);
			}
			catch(Exception e)
			{
				
			}*/
		}
		System.out.println("exit from C");
	}
}
class threading {

	public static void main(String[] args) {
		A ThreadA=new A();
		
		B ThreadB=new B();
		
		C ThreadC=new C();
		ThreadC.setPriority(10);
		ThreadB.setPriority(5);
		ThreadC.setPriority(1);
		System.out.println("start thread A");
		ThreadA.start();
		System.out.println("start thread B");
		ThreadB.start();
		System.out.println("start thread C");
		ThreadC.start();
		System.out.println("end of main thread");
	}

}
