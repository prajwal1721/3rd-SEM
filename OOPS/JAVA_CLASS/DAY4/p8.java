/*
    1 
   1 2 
  1 2 3 
 1 2 3 4 
1 2 3 4 5 */
import java.util.Scanner;
class p8
{
    public static void main(String args[])
    {
        int n;
        Scanner sc=new Scanner(System.in);
        n=sc.nextInt();
        for(int i=1;i<=n;i++)
        {
            for(int j=i;j<=n;j++)
        {
            System.out.print(" ");
        }
            for(int j=1;j<=i;j++)
        {
            System.out.print(j+" ");

        }
        System.out.println("");
        
    }
}
}