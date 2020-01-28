import java.util.Scanner;
class add
{
    public static void main(String args[])
    {
        
        int n,sum=0;
        Scanner sc= new Scanner(System.in);
         n=sc.nextInt();
         int[] arr=new int[n] ;
         for(int i=0;i<n;i++)
         {
             arr[i]=sc.nextInt();
             sum=sum+arr[i];
         }
         System.out.println(sum);
    }
}