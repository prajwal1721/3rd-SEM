import java.util.Scanner;
class sortd3
{
    public static void main(String args[])
    {
        
        int n,sum=0,l;
        Scanner sc= new Scanner(System.in);
         n=sc.nextInt();
         int[] arr=new int[n] ;
         int i=0;
         do
         {
             arr[i]=sc.nextInt();
             i++;
        }while(i<n);
        int j=0;
         do
         {
            i=0;
            do
            {
                if(arr[i]<arr[i+1])
                {
                    l=arr[i];
                    arr[i]=arr[i+1];
                    arr[i+1]=l;
                }
                i++;
            }while(i<n-1);
            j++;   
         }while(j<n);
         i=0;
         do
         {
             System.out.print(arr[i]+" ");
            i++;
         }while(i<n);

    }
}
