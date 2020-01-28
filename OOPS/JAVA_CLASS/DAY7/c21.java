import java.util.Scanner;
class c21
{
    public void bitodec(int l)
    {
        int n=0,p=1,bi=0;
        for(;l>0;)
        {
            int r=l%10;
            l=l/10;
            n=n+p*r;
            p=p*2;
        }
        for(p=1;n>0;)
        {
            int r=n%8;
            n=n/8;
            bi=bi+r*p;
            p=p*10;
        }
        System.out.println(bi);
    }
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int s=sc.nextInt();
        c21 ko=new c21();
        ko.bitodec(s);
    }
}