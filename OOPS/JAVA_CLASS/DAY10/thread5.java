import java.lang.Runnable;
class thread5
{
    public static void main(String[] args) {
    new e();
    }
}
class e implements Runnable
{
    e()
    {
       Thread th= new Thread(this);
         th.start();
    }
    public void run()
    {
        Thread l=new Thread();
        for(int i=0;i<50;i++)
        System.out.println(l.currentThread()+"  "+i);
    }
}