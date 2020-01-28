import java.util.Scanner;
class sum2
{
    public static void main(String args[])
    {
        int i=0,n;
        Scanner sc= new Scanner(System.in);
        n=sc.nextInt();
        while(n>0)
        {
            i=i+n%10;
            n=n/10;
        }
        System.out.print(i+"\n");
    }
}