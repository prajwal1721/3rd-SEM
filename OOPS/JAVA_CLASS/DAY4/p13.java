  /* 
        5 
      5 4 
    5 4 3 
  5 4 3 2 
5 4 3 2 1 */
import java.util.Scanner;
class p13
{
    public static void main(String args[])
    {
        int n;
        Scanner sc=new Scanner(System.in);
        n=sc.nextInt();
        for(int i=1;i<=n;i++)
        {
            for(int j=i+1;j<=n;j++)
        {
            System.out.print("  ");
        }
            for(int j=1;j<=i;j++)
        {
            System.out.print(n-j+1+" ");

        }
        System.out.println("");
        
    }
}
}