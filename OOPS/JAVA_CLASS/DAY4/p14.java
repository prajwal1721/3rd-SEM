/*
                                1
                        2       3
                4       5       6
        7       8       9       10
11      12      13      14      15
*/

import java.util.Scanner;
class p14
{
    public static void main(String args[])
    {
        int n,c=1;
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
            System.out.print(c+"\t");
            c++;

        }
        System.out.println("");
        
    }
}
}