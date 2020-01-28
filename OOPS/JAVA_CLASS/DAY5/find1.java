import java.util.Scanner;
class find1
{
    public static void main(String args[])
    {
        
        int n,l,flag=0,index=0;
        Scanner sc= new Scanner(System.in);
         n=sc.nextInt();
         int[] arr=new int[n] ;
         for(int i=0;i<n;i++)
         {
             arr[i]=sc.nextInt();
         }
         System.out.println("ENTER THE ELEMENT TO SEARCH");
          l=sc.nextInt();
            for(int i=0;i<n;i++)
            {
                if(l==arr[i])
                {
                   flag++;
                  index=i;
                }
            }   
         if(flag!=0)
         {
            System.out.println("FOUND and no is "+(index+1));
         }
         else
         {
            System.out.println("N0T FOUND");
         }

sc.close();
    }
}
