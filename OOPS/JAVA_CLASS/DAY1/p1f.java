import java.util.Scanner;
class p1f
{
    public static void main(String[] args)
    {
        int a,b,c,d;
        Scanner sc= new Scanner(System.in);
        a=sc.nextInt();
        b=sc.nextInt();
        c=sc.nextInt();
        d=sc.nextInt();
        if(a>b&&a>c && a>d)
        {
            System.out.println(a);
        }
        else if(b>c&&b>a && b>d )
        {
            System.out.println(b);

        }
        else if(c>b&&c>a && c>d )
        {
            System.out.println(c);

        }
        else
        System.out.println(d);
    }
}