// binary to decimal
import java.util.Scanner;
class d1
{
    public static void main(String args[])
    {
        int ip=1,a=0,p,n;
        Scanner sc= new Scanner(System.in);
        n=sc.nextInt();
for (;n>0;)
{
p=n%10;
n=n/10;
a=a+p*ip;
ip=ip*2;
}
System.out.println(a);
    }
}