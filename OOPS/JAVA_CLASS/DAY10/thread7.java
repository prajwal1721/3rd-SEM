import java.lang.Runnable;
class thread7
{
    public static void main(String args[])
    {
        Runnable r= new Runnable()
 {   public void run()
    {
        Thread th= new Thread();
        for (int i=0;i<10;i++)
        {
        System.out.println(i+" "+th.currentThread());
        }
    }
 }
Thread th1= new Thread(r);
        th1.start();
    }
}