import java.util.Scanner;
class rev1
{
    public static void main(String args[])
    {
        int s,n,a=0;
        Scanner sc= new Scanner(System.in);
        n=sc.nextInt();
        for(;n>0;)
        {
            s=n%10;
            a=a*10+s;
           n=n/10;
        }
        System.out.println(a);
    }
}