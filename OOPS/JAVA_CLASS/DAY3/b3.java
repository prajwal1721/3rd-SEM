
//decimal to binary 
import java.util.Scanner;
class b3
{
    public static void main(String args[])
    {
        int n,p,a=0;
        Scanner sc= new Scanner(System.in);
        n=sc.nextInt();
     do 
        {
            p=n%2;
            n=n/2;
            a=a*10+p;
        }   while(n>0);
        System.out.println(a);
    }
}