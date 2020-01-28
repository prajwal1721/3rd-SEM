import java.util.Scanner;
class fib3
{
    public static void main(String args[])
    {

        int no=1,noo,i=1,j=0,n=0;
        Scanner sc = new Scanner(System.in);
        noo= sc.nextInt();
        do
        {
            System.out.print(no+" ");
            no=j+i;
            j=i;
            i=no;
            n++;
        }while(n<=noo);
    }
}