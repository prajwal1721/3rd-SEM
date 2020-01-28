// binary to decimal
import java.util.Scanner;
class d3
{
    public static void main(String args[])
    {
        int ip=1,a=0,p,n;
        Scanner sc= new Scanner(System.in);
        n=sc.nextInt();
do
{
p=n%10;
n=n/10;
a=a+p*ip;
ip=ip*2;
}while (n>0);
System.out.println(a);
    }
}