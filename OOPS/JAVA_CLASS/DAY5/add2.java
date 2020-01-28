import java.util.Scanner;
class add2
{
    public static void main(String args[])
    {
        
        int n,sum=0;
        Scanner sc= new Scanner(System.in);
         n=sc.nextInt();
         int[] arr=new int[n] ;
         int i=0;
         while(i<arr.length)
         {
             arr[i]=sc.nextInt();
             sum=sum+arr[i];
             i++;
         }
         System.out.println(sum);
    }
}