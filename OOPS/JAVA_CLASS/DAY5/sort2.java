import java.util.Scanner;
class sort2
{
    public static void main(String args[])
    {
        
        int n,sum=0,l;
        Scanner sc= new Scanner(System.in);
         n=sc.nextInt();
         int[] arr=new int[n] ;
         int i=0;
         while(i<n)
         {
             arr[i]=sc.nextInt();
             i++;
        }
        int j=0;
         while(j<n)
         {
            i=0;
            while(i<n-1)
            {
                if(arr[i]>arr[i+1])
                {
                    l=arr[i];
                    arr[i]=arr[i+1];
                    arr[i+1]=l;
                }
                i++;
            }
            j++;   
         }
         i=0;
         while(i<n)
         {
             System.out.print(arr[i]+" ");
            i++;
         }

    }
}
