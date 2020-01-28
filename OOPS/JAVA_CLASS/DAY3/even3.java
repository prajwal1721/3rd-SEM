import java.util.Scanner;
class even3
{
    public static void main(String args[])
    {
        int i=2,n;
        Scanner sc=new Scanner(System.in);
        n=sc.nextInt();
        do
        {
            System.out.print(i+" ");
           i+=2;
        }while(i<=n);
    }
}