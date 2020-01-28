import java.util.Scanner;
class s2a
{
    public static void main(String args[])
    {
        int no,i,n=0;
        Scanner sc = new Scanner(System.in);
        no= sc.nextInt();
        for(i=1;i<=no;i++)
        {
            n=n+i*i;
        }
        System.out.println(n);
    }
}