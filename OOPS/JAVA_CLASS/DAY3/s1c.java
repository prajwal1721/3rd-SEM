import java.util.Scanner;
class s1c
{
    public static void main(String args[])
    {
        int no,i=1,n=0;
        Scanner sc = new Scanner(System.in);
        no= sc.nextInt();
        do
        {
            n=n+i;
            i++;
        }while (i<=no);
        System.out.println(n);
    }
}