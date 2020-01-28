import java.io.*;
import java.lang.Thread;
class p10
{
    public static void mian(String args[])
    {
        System.out.println("MAIN STARTED\n");
        for(int i=0;i<10;i++)
        {
            System.out.println("HI");
        }
        System.out.println("MAIN ENDED \"");
    t n= new t();
    Thread th= Thread.currentThread();
    n.start();
    }
}
class t extends p10
{
    public void run()
    {
        int i=0;
        System.out.println("i"+i);
    }
}