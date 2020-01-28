import java.util.Scanner;
class c27
{
    public void multi(int[][]a,int [][]b,int n)
    {
        int arr[][]=new int[n][n];
        for(int k=0;k<n;k++)
        {
        for(int i=0;i<n;i++)
        {
            for(int j=0;j<n;j++)
            {
                arr[k][i]=arr[k][i]+a[k][j]*b[j][i];
            }
        }
    }
    for(int i=0;i<n;i++)
        {
            for(int j=0;j<n;j++)
            {
                System.out.print(arr[i][j]+" ");
            }
            System.out.println("");
        }
    }
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int a[][]=new int[n][n];
        int b[][]=new int[n][n];
        for(int i=0;i<n;i++)
        {
            for(int j=0;j<n;j++)
            {
                a[i][j]=sc.nextInt();
            }
        }
        for(int i=0;i<n;i++)
        {
            for(int j=0;j<n;j++)
            {
                b[i][j]=sc.nextInt();
            }
        }
        c27 pp=new c27();
        pp.multi(a,b,n);
    }
}