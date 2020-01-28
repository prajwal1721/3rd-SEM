import java.util.Scanner;
class c9
{
    public long bi;
   public  int r,p;
c9()
{
bi=0;
p=1;
}
    public void dectobi(int n)
    {
      
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
        c9 s=new c9();
        s.dectobi(n);
    }
}