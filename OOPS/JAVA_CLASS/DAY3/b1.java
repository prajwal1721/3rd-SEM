//decimal to binary 
import java.util.Scanner;
class b1
{
    public static void main(String args[])
    {
        int n,p,b=1,a=0;
        Scanner sc= new Scanner(System.in);
        n=sc.nextInt();
        for(;n>0;)
        {
            p=n%2;
            n=(n-p)/2;
            a=a+p*b;
            b=b*10;
        }
        System.out.println(a);
    }
}