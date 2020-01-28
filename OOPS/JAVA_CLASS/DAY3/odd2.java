import java.util.Scanner;
class odd2
{
    public static void main(String args[])
    {

        int no,i=1,n=0,p=1;
        Scanner sc = new Scanner(System.in);
        no= sc.nextInt();
        while(i<=no)
        {
            System.out.print(i+" ");
            i+=2;
        }
    }
}