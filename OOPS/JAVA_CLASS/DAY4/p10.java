/*
        1 
      1 2 
    1 2 3 
  1 2 3 4 
1 2 3 4 5 */

import java.util.Scanner;
class p10
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
            System.out.print("\t");
        }
            for(int j=1;j<=i;j++)
        {
            System.out.print(j+"\t");

        }
        System.out.println("");
        
    }
}
}