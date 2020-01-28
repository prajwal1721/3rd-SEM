import java.util.Scanner;
class c13
{
    public void sum(int n)
    {
        int sum=0;
        for(;n>0;)
        {
            int r=n%10;
            n=n/10;
            sum=sum+r;
        }
        System.out.println(sum);
    }
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        c13 kd=new c13();
        kd.sum(n);
    }
}