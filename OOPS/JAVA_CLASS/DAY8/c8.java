import java.util.Scanner;
class c8
{
    public    int sum,m;
    c8()
    {
        sum=0; 
    }

    public void sum(int n)
    {
        for(;n>0;)
        {
            m=n;
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
        c8 kd=new c8();
        kd.sum(n);
    }
}