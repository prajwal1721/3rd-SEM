import java.util.Scanner;
class even2
{
    public static void main(String args[])
    {
        int i=2,n;
        Scanner sc=new Scanner(System.in);
        n=sc.nextInt();
        while(i<=n)
        {
            System.out.print(i+" ");
           i+=2;
        }
    }
}