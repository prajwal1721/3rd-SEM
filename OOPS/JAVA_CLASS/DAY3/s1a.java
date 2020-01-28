import java.util.Scanner;
class s1
{
    public static void main(String args[])
    {
        int no,i,n=0;
        Scanner sc = new Scanner(System.in);
        no= sc.nextInt();
        for(i=1;i<=no;i++)
        {
            n=n+i;
        }
        System.out.println(n);
    }
}