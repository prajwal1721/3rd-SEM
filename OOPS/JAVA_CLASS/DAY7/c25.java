import java.util.Scanner;
class c25
{
    public void find(int[]a,int n,int b)
    {
        for(int i=0;i<n;i++)
        {
            if(a[i]==b)
            {
                System.out.println("FOUND INDEX:"+(i+1));
            }
        }
    }
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
       int arr[]=new int[n];
        for(int i=0;i<n;i++)
        {
            arr[i]=sc.nextInt();
        }
        c25 g=new c25();
        System.out.println("ENTER ELEMENTS TO FIND");
        int b=sc.nextInt();
        g.find(arr,n, b);
    }
}