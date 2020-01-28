import java.util.Scanner;
class lucas3
{
    public static void main(String args[])
    {

        int no=1,noo,i=1,j=0,n=0;
        Scanner sc = new Scanner(System.in);
        noo= sc.nextInt();

        System.out.print("0 ");
        do
        {
            System.out.print(no+" ");
            no=j+i;
            j=i;
            i=no;
            n++;
        }while(n<noo);
        System.out.print("\n");
    }
}