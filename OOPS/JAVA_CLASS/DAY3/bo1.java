//binary to octal
import java.util.Scanner;
class bo1
{
    public static void main(String agrs[])
    {
        int bin,r,b=1,l=1,dec=0,oct=0;
        Scanner sc= new Scanner(System.in);
        bin=sc.nextInt();
        for(;bin>0;)
        {
           r=bin%10;
           bin=bin/10;
           dec=dec+r*b;
           b=b*2;
        }
        for(;dec>0;)
        {
            r=dec%8;
            dec=dec/8;
            oct=oct+r*l;
            l=l*10;
        }
        System.out.println(oct);
    }
}