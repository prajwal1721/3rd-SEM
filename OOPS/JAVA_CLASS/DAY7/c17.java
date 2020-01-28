import java.util.Scanner;
class c17
{
    public void dectobi(int n)
    {
        long bi=0;
        int r,p=1;
        for(;n>0;)
        {
            r=n%2;
            n=n/2;
            bi=bi+r*p;
            p=p*10;
        }
        System.out.println(bi);
    }
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        c17 s=new c17();
        s.dectobi(n);
    }
}