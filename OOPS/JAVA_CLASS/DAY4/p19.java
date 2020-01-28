/*
        *   
      *   *   
    *   *   *   
  *   *   *   *   
    *   *   *   
      *   *   
        *   
*/

import java.util.Scanner;
class p19
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
            System.out.print("  ");
        }
            for(int j=1;j<=i;j++)
        {
            System.out.print("Y   ");

        }
        System.out.println("");
        
    }
   
    for(int i=1;i<=n;i++)
    {
        System.out.print("  ");
        for(int j=1;j<=i;j++)
        {
            System.out.print("  ");
        }
        for(int j=n-i;j>0;j--)
    {
        System.out.print("Y   ");

    }
    System.out.println("");
    
}
}
}