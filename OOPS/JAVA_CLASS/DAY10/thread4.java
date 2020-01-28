//creating thread without lang.Thread
import java.lang.Runnable;
class thread4
{
    public static void main(String args[])
    {
        A l = new A();
        Thread th1=new Thread(l);
        Thread th2=new Thread(l);
        th1.start();
        th2.start();
    }
}
class A implements Runnable
{
    public void run()
    {
        Thread th = new Thread() ;
        for(int i=0;i<50;i++)
        {
        System.out.println(th.currentThread()+" "+i*2);
        }
}
}