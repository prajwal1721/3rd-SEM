import java.util.Scanner;
class arradd2
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
         while(i<n)
         {
             arr[i]=sc.nextInt();
             i++;
         }
         i=0;
         while( i<n)
         {
             arrl[i]=sc.nextInt();
             i++;
         }
         i=0;
         while( i<n)
         {
            sum[i]=arr[i]+arrl[i];
             i++;
         }
         i=0;
         while( i<n)
         {
         System.out.print(sum[i]+" ");
         i++;
         }sc.close();
         System.out.println("");
    
    }

}