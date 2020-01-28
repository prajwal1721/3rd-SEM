import java.lang.Thread;
class thread1
{
    public static void main(String args[])
    {
      
        Thread th= new Thread();
      ThreadGroup tg=th.getThreadGroup();
        System.out.println(th.getName());
        for(int i=0;i<50;i++)
        {
            System.out.println(i+"  HI"+th.getName()+" f " + tg.getName());
        }
      
        a p=new a();
   // p.start();
    a pa=new a();
   p.start();
   pa.start();
  //  p.run();
    }
}
class a extends Thread
{
    static int i;
    a()
    {
        i=1;
    }
    public void  run()
    {
        
        Thread th=new Thread();
        ThreadGroup tg=th.getThreadGroup();
        for(i=0;i<100;i++)
        System.out.println("NAME "+i+" "+th.currentThread()+" "+tg.getName());
        i++;
    }
    {

    }
}