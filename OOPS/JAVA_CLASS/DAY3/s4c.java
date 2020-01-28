import java.util.Scanner;
class s4c
{
    public static void main(String args[])
    {

        int no,i=1,n=0,p=1;
        Scanner sc = new Scanner(System.in);
        no= sc.nextInt();
        do
        {
            n=n+p*i;
            p=p*-1;
            i++;
        }while(i<=no);
        System.out.println(n);
    }
}