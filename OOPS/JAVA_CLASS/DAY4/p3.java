/*
5 
4 5 
3 4 5 
2 3 4 5 
1 2 3 4 5 */
import java.util.Scanner;
class p3
{
    public static void main(String args[])
    {
        int n;
        Scanner sc=new Scanner(System.in);
        n=sc.nextInt();
        for(int i=1;i<=n;i++)
        {
            for(int j=i;j>0;j--)
        {
            System.out.print((n-j+1)+" ");

        }
        System.out.println("");
        
    }
}
}