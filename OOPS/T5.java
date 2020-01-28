import java.lang.*;
class SIN implements Runnable
{
	double a;
	Thread t;
	SIN()
	{
		t=new Thread(this,"d");
	}
	public void run()
	{
		
            cal();
    }
	 synchronized void cal()
	{
		a=Math.sin(1);
	}
}
class COS implements Runnable
{
        double a;
        Thread t;
        COS()
        {
                t=new Thread(this,"d");
        }
        public void run()
        {
                    cal();
  
        }
        synchronized void cal()
        {
                a=Math.cos(1);
        }
                }
class TAN implements Runnable
{
        double a;
        Thread t;
        TAN()
        {
                t=new Thread(this,"d");
        }
        public void run()
        {
            cal();
        }
        synchronized void cal()
        {
                a=Math.tan(1);
        }
}
public class T5
{
	public static void main(String args[])
	{
		SIN s=new SIN();
		COS c=new COS();
		TAN t=new TAN();
    try
    {    s.t.start();
        Thread.sleep(1000);
    
        c.t.start();
        Thread.sleep(1000);
     
        t.t.start();
        Thread.sleep(1000);
    }
    catch (InterruptedException e)
    {
        System.out.println("Hi");
    }
		System.out.println("p="+(s.a+c.a+t.a));	
	}
}	