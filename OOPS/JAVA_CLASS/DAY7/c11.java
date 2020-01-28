import java.util.Scanner;
class c11
{
    public void fib(int n)
    {
        int p=0,q=1,s=0;
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
            c11 k=new c11();
            k.fib(m);
        } 
}
