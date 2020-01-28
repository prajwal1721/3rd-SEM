import java.util.Scanner;
class c15
{
    public void sum(int n)
    {
        int sum=0,m=n;
        for(;n>0;)
        {
            int r=n%10;
            n=n/10;
            sum=sum*10+r;
        }
        if(sum==m)
        System.out.println(sum+" YES");
        else 
        System.out.println(sum+" NO");
    }
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        c15 kd=new c15();
        kd.sum(n);
    }
}