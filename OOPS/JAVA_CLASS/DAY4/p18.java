/*
1  2  3  3  2  1  
1  2        2  1  
1              1  
1              1  
1  2        2  1  
1  2  3  3  2  1 
*/
import java.util.Scanner;
class p18
{
    public static void main(String args[])
    {
        int n;
        Scanner sc=new Scanner(System.in);
        n=sc.nextInt();
        for(int i=1;i<=n;i++)
        {
            for(int j=1;j<=n-i+1;j++)
            {
                System.out.print(j+"  ");
            }
            for(int j=1;j<i;j++)
            {
                System.out.print("      ");
            }
            for(int j=n-i+1;j>0;j--)
            {
                System.out.print(j+"  ");
            }
            System.out.println("");
        }
     for(int i=1;i<=n;i++)
        {
        for(int j=1;j<=i;j++)
        {
            System.out.print(j+"  ");
        }
        for(int j=1;j<n-i+1;j++)
        {
            System.out.print("      ");
        }
        for(int j=i;j>0;j--)
        {
            System.out.print(j+"  ");
        }
        System.out.println("");
    }
    }
}
