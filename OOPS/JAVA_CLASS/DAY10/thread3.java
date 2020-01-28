import java.lang.Thread;
class thread3
{
    public static void main(String args[])
    {
        Thread s= new Thread();
        s.start();
        new hello().show();
        for(char ch='a';ch<'j';ch++)
        {
            System.out.println(ch+" after the show  "+(int)ch   );
        }
System.out.println("OVER 00");
 A ps= new A();
 ps.start();    
}

}
class hello
{
    void show()
    {
        Thread th=new Thread();
        ThreadGroup tg= th.getThreadGroup();
        for(int i=0;i<100;i++)
        {
            System.out.println(th.currentThread()+"llllll"+ i+" "+ tg.getName());
        if(i==5)
        {
            //int x=10/0;
        }
        }
    }
        public void process()
        {
            Thread ta=new Thread();
          //  ThreadGroup tag= ta.getThreadGroup();
            for(int i=0;i<100;i++)
            {
                System.out.println("PROC "+i+" "+ta.currentThread());
            }
        }  
    }
    class A extends Thread{
        public void run()
        {
            new hello().process();
        }
    }
