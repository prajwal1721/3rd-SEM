//octal to decimal 
import java.util.Scanner;
class ob1
{
    public static void main(String args[])
    {
        int j=1,a,l=0,p,b=1,n,no;
        Scanner sc=new Scanner(System.in);
     n=sc.nextInt();
     for(;n>0;)
     {
         a=n%10;
         n=n/10;
         l=l+a*j;
         j=j*8;
     }
     a=0;n=0;
     for(;l>0;)
        {
            p=l%2;
            l=(l-p)/2;
            a=a+p*b;
            b=b*10;
        }
        System.out.println(a);
    }
}