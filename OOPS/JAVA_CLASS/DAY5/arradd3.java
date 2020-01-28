import java.util.Scanner;
class arradd3
{
    public static void main(String args[])
    {
        
        int n;
        Scanner sc= new Scanner(System.in);
         n=sc.nextInt();
         int arr[]=new int[n] ;
         int arrl[]=new int[n] ;
         int sum[]=new int[n] ;
         int i=0;
         do
         {
             arr[i]=sc.nextInt();
             i++;
         }while( i<n);
         i=0;
         do
         {
             arrl[i]=sc.nextInt();
             i++;
         }while( i<n);
         i=0;
         do
         {
            sum[i]=arr[i]+arrl[i];
             i++;
         }while( i<n);
         i=0;
         do
         {
         System.out.print(sum[i]+" ");
         i++;
         }while( i<n);
         sc.close();
         System.out.println("");
    
    }

}