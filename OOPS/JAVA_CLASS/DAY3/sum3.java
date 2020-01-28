import java.util.Scanner;
class sum3
{
    public static void main(String args[])
    {
        int i=0,n;
        Scanner sc= new Scanner(System.in);
        n=sc.nextInt();
        do
        {
            i=i+n%10;
            n=n/10;
        }while(n>0);
        System.out.print(i+"\n");
    }
}