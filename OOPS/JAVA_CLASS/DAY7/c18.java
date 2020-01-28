import java.util.Scanner;
class c18
{
    public void dectooct(int n)
    {
        long bi=0;
        int r,p=1;
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
        c18 s=new c18();
        s.dectooct(n);
    }
}