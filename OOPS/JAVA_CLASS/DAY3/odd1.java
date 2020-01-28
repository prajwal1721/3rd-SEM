import java.util.Scanner;
class odd
{
    public static void main(String args[])
    {

        int no,i,n=0,p=1;
        Scanner sc = new Scanner(System.in);
        no= sc.nextInt();
        for(i=1;i<=no;i+=2)
        {
            System.out.print(i+" ");
        }
    }
}