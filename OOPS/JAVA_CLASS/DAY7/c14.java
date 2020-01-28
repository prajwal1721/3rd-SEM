import java.util.Scanner;
class c14
{
    public int  sum(int n)
    {
        int sum=0;
        for(;n>0;)
        {
            int r=n%10;
            n=n/10;
            sum=sum+r;
        }
        return sum;
       
    }
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        c14 kd=new c14();
        int sum=kd.sum(n);
        System.out.println(sum);
    }
}