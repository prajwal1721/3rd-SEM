import java.util.Scanner;
class sort1
{
    public static void main(String args[])
    {
        
        int n,sum=0,l;
        Scanner sc= new Scanner(System.in);
         n=sc.nextInt();
         int[] arr=new int[n] ;
         for(int i=0;i<n;i++)
         {
             arr[i]=sc.nextInt();
         }
         for(int j=0;j<n;j++)
         {
            for(int i=0;i<n-1;i++)
            {
                if(arr[i]>arr[i+1])
                {
                    l=arr[i];
                    arr[i]=arr[i+1];
                    arr[i+1]=l;
                }
            }   
         }
         for(int i=0;i<n;i++)
         {
             System.out.print(arr[i]+" ");
         }

    }
}
