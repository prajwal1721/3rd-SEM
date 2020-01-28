import java.util.Scanner;
class c7
{
    public int sum;

    public void sum(int n)
    {
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
        c7 kd=new c7();
        kd.sum(n);
        sc.close();
    }
}