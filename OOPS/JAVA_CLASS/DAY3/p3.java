import java.util.Scanner;
class p3
{
    public static void main(String args[])
    {
        int s,n,a=0;
        Scanner sc= new Scanner(System.in);
        n=sc.nextInt();
        int m =n;
        do
        {
            s=n%10;
            a=a*10+s;
           n=n/10;
        }while(n>0);
        if(a==m)
        System.out.println("YES");
        else
        System.out.println("NO");
    }
}