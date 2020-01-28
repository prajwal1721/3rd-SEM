import java.util.Scanner;
class bitohex
{
    public static void main(String args[])
    {
        long dec=0;
        long bi=0;
        char po=(char)48;
        Scanner  sc=new Scanner(System.in);
        System.out.print("0x");
        bi=sc.nextLong();
         for(;bi>0;)
         {
          long r=bi%10000;
          bi=bi/10000;
          long noo=0;
          long n=1;
          for(;r>0;)
          {
              long b=r%10;
              r=r/10;
              noo=noo+b*n;
              n=n*2;
          }
          noo=dec;
          System.out.println("h"+noo);
        }
        
    }
}