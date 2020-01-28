import java.util.Scanner;
class c16
{
    public int sum(int n)
    {
        int sum=0;
        for(;n>0;)
        {
            int r=n%10;
            n=n/10;
            sum=sum*10+r;
        }
        return sum;
        
    }
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        c16 kd=new c16();
        int m=kd.sum(n);
        if(n==m)
        System.out.println(m+" YES");
        else 
        System.out.println("REVERSE is "+m+" NO");
      sc.close();
    }
}