/*
        5 
      4 4 
    3 3 3 
  2 2 2 2 
1 1 1 1 1  */
import java.util.Scanner;
class p11
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
            System.out.print(" ");
        }
            for(int j=1;j<=i;j++)
        {
            System.out.print(n-i+1+"");

        }
        System.out.println("");
        
    }
}
}