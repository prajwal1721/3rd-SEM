/*
1 
2 1 
3 2 1 
4 3 2 1 
5 4 3 2 1 */
import java.util.Scanner;
class p2
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
            System.out.print(j+" ");

        }
        System.out.println("");
        
    }
}
}