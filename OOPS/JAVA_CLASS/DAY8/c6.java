import java.util.Scanner;
class c6
{
    public  int p,q,s;
    c6()
    {
        p=0;q=1;s=0;
    }
    public void fib(int n)
    {
       
        System.out.print(q+" ");
        for(int c=1;c<=n;c++)
        {
            s=p+q;
            System.out.print(s+" ");
            p=q;
            q=s;
        }
    }
        public static void main(String args[])
        {
            Scanner sc= new Scanner(System.in);
            int m=sc.nextInt();
            c6 k=new c6();
            k.fib(m);
            sc.close();
        } 
}