import java.util.Scanner;
class G5
{
    public static void main(String args[])
    {
        int a,b,c,d,e;
        Scanner sc=new Scanner(System.in);
       { a=sc.nextInt();
        b=sc.nextInt();
        c=sc.nextInt();
        d=sc.nextInt();
        e=sc.nextInt();
       }
if(a>b)
{
    if(a>c)
    {
        if(a>d)
        {
            if(a>e)
            {
                System.out.println(a);
            }
            else
            {
                System.out.println(e);
            }
        }
        else
        {
            if(d>e)
            {
                System.out.println(d);
            }
            else
            {
                System.out.println(e);
            }
        }
       
    }
    else
    {
        if(c>d)
        {
            if(c>e)
            {
                System.out.println(c);
            }
            else
            {
                System.out.println(e);
            }
        }
        else
        {
            if(d>e)
            {
                System.out.println(d);
            }
            else
            {
                System.out.println(e);
            }
        }
    }
}
else
{
    if(b>c)
    {
        if(b>d)
        {
            if(b>e)
            {
                System.out.println(b);
            }
        }
        else
        {
            if(d>e)
            {
                System.out.println(d);
            }
            else
            {
                System.out.println(e);
            }
        }
    }
    else
    {
        if(c>d)
        {
            if(c>e)
            {
                System.out.println(c);
            }
            else
            {
                System.out.println(e);
            }
        }
        else
        {
            if(d>e)
            {
                System.out.println(d);
            }
            else
            {
                System.out.println(e); 
            }
        }
    }
}
   
}
}