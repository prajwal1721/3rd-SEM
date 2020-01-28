import java.util.Scanner;
class arradd1
{
    public static void main(String args[])
    {
        
        int n;
        Scanner sc= new Scanner(System.in);
         n=sc.nextInt();
         int arr[]=new int[n] ;
         int arrl[]=new int[n] ;
         int sum[]=new int[n] ;
         for(int i=0;i<n;i++)
         {
             arr[i]=sc.nextInt();
             
         }
         for(int i=0;i<n;i++)
         {
             arrl[i]=sc.nextInt();
             
         }
         for(int i=0;i<n;i++)
         {
            sum[i]=arr[i]+arrl[i];
             
         }
         for(int i=0;i<n;i++)
         { 
         System.out.print(sum[i]+" ");
         }sc.close();
         System.out.println("");
    
    }

}