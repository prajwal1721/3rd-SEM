import java.util.*;
public class B10
{
    public static void main(String[] args) {
        Thread t1=new Thread();
        Thread t2=new Thread();
        Thread t3=new Thread();
        Thread t4=new Thread();
        Thread t5=new Thread();
        t1.setPriority(8);
        t2.setPriority(8);
        try 
        {
            t1.start();
            t2.start();
            if(t1.isAlive())
                System.out.println("Yes");
            else
                System.out.println("NO");
            Thread.sleep(1000);
            if(t1.isAlive())
            System.out.println("Yes");
        else
            System.out.println("NO");
            Thread.sleep(1000);
            if(t2.isAlive())
            System.out.println("Yes");
        else
            System.out.println("NO");
            
        }
        catch(InterruptedException e)
        {

        }
    }
}