import java.util.Scanner;
class add3
{
    public static void main(String args[])
    {
        
        int n,sum=0;
        Scanner sc= new Scanner(System.in);
         n=sc.nextInt();
         int[] arr=new int[n] ;
         int i=0;
         do
         {
             arr[i]=sc.nextInt();
             sum=sum+arr[i];
             i++;
         }while(i<arr.length);
         System.out.println(sum);
    }
}