import java.util.Scanner;
class s6a
{
    public static void main(String args[])
    {

        int no,i,n=0,p=1;
        Scanner sc = new Scanner(System.in);
        no= sc.nextInt();
        for(i=1;i<=no;i++)
        {
            n=n+p*i*i*i;
            p=p*-1;
        }
        System.out.println(n);
    }
}