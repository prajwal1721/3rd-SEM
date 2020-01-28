//palindrome
import java.util.Scanner;
class p1
{
    public static void main(String args[])
    {
        int s,n,m,a=0;
        Scanner sc= new Scanner(System.in);
        n=sc.nextInt(); 
        for( m=n;n>0;)
        {
            s=n%10;
            a=a*10+s;
           n=n/10;
        }
        if(a==m)
        System.out.println("YES");
        else
        System.out.println("NO");
    }
}