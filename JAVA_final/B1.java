import java.util.*;
public class B1
{
    public static void main(String[] args) {
        
        odd o=new odd();
        rev r=new rev();
        try
        {   
            r.t.start();
            Thread.sleep(1000);
            o.t.start();
            Thread.sleep(1000);
        }   
    catch(InterruptedException e)
{    System.out.println("Caught");
    }
}
}
class odd implements Runnable
{
    Thread t;
    static int n;
    odd()
    {
        t=new Thread(this);
        n=0;
    }
    public void run()
    {
        int count=0;
        for(int i=100;i<500;i++)
        {
            if(count==n&& n<3 && i%2!=0)
            {
                n++;
                System.out.println("odd"+i);
            }
            else if(i%2==1)
                count++;
        }
    }
}
class rev implements Runnable
{
    Thread t;
    rev()
    {
        t=new Thread(this);
    }
    public void run()
    {
        Scanner sc =new Scanner (System.in);
        String st;
        StringBuilder s = new StringBuilder(); 
        System.out.println("Enter the number");
        st=sc.nextLine();    
        s.append(st);
        // s=Integer.toString(i);
        s=s.reverse();
        System.out.println(s);
        sc.close();
    }    
}