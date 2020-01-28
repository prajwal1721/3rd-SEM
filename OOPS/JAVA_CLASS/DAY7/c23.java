import java.util.Scanner;
class c23
{
    public void pattern(int n)
    {
        for(int i=1;i<=n;i++)
      {
          for(int j=1;j<=i;j++)
          {
              System.out.print(j+" ");
          }
          System.out.println("");
      }
    }
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int m=sc.nextInt();
        c23 lp=new c23();
        lp.pattern(m);
    }
}