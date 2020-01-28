import java.util.Scanner;
class find2
{
    public static void main(String args[])
    {
        
        int n,flag=0,l,index=0;
        Scanner sc= new Scanner(System.in);
         n=sc.nextInt();
         int[] arr=new int[n] ;
         int i=0;
         while(i<n)
         {
             arr[i]=sc.nextInt();
             i++;
        }
            i=0;
            System.out.println("ENTER THE ELEMENT TO SEARCH");
            l=sc.nextInt();
            while(i<n)
            {
                if(l==arr[i])
                {
                   flag++;
                   index=i;
                }
                i++;
            }
            if(flag!=0)
            {
               System.out.println("FOUND and  no is "+ (index+1));
            }
            else
            {
               System.out.println("N0T FOUND");
            }
   
   sc.close();

    }
}
