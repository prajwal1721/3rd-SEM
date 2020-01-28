import java.util.Scanner;
class c10
{
    public  long bi;
    public int r,p;
    c10()
    {bi=0;
        p=1;
    }
    public void dectooct(int n)
    {
        for(;n>0;)
        {
            r=n%8;
            n=n/8;
            bi=bi+r*p;
            p=p*10;
        }
        System.out.println(bi);
    }
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        c10 s=new c10();
        s.dectooct(n);
    }
}