import java.util.Scanner;
class c20
{
    public void bitodec(long l)
    {
        int n=0,p=1;
        for(;l>0;)
        {
            int r=(int)l%10;
            l=l/10;
            n=n+p*r;
            p=p*2;
        }
        System.out.println(n);
    }
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        long s=sc.nextLong();
        c20 ko=new c20();
        ko.bitodec(s);
    }
}