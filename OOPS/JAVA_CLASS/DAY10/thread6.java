import java.lang.Runnable;
class thread6
{
    public static void main(String[] args) {
    new e().start();;

    }
}
class e implements Runnable
{
    Thread th;
    e()
    {
       th= new Thread(this);
 //        th.start();
    }
    public void run()
    {
        Thread l=new Thread();
        for(int i=0;i<50;i++)
        System.out.println(l.currentThread()+"  "+i);
    }
    void start()
    {
        th.start();
    }
}