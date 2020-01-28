import java.util.Scanner;
class even1
{
    public static void main(String args[])
    {
        int i=2,n;
        Scanner sc=new Scanner(System.in);
        n=sc.nextInt();
        for(i=2;i<=n;i+=2)
        {
            System.out.print(i+" ");
        }
    }
}