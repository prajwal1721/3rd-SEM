import java.util.Scanner;
class s5b
{
    public static void main(String args[])
    {

        int no,i=1,n=0,p=1;
        Scanner sc = new Scanner(System.in);
        no= sc.nextInt();
        while(i<=no)
        {
            n=n+p*i*i;
            p=p*-1;
            i++;
        }
        System.out.println(n);
    }
}