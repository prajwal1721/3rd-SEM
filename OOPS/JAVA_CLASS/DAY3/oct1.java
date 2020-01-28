//octal to decimal 
import java.util.Scanner;
class oct1
{
    public static void main(String args[])
    {
        int j=1,a,l=0,n;
        Scanner sc=new Scanner(System.in);
     n=sc.nextInt();
     for(;n>0;)
     {
         a=n%10;
         n=n/10;
         l=l+a*j;
         j=j*8;
     }
     System.out.println(l);
    }
}