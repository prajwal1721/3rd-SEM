import java.util.Scanner;
class s3b
{
    public static void main(String args[])
    {
        int no,i=1,n=0;
        Scanner sc = new Scanner(System.in);
        no= sc.nextInt();
        while (i<=no)
        {
            n=n+i*i*i;
            i++;
        }
        System.out.println(n);
    }
}