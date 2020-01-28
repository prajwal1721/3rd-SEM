import java.util.Scanner;
class c12
{
    public int[] fib(int n)
    {
        int arr[]=new int[n];
        int p=0,q=1,s=1;
        //System.out.print(q+" ");
arr[0]=s;
        for(int c=1;c<n;c++)
        {
            arr[c]=p+q;
            
            p=q;
            q=arr[c];
        }
         return arr;
    }
        public static void main(String args[])
        {
            Scanner sc= new Scanner(System.in);
            int m=sc.nextInt();
            c12 k=new c12();
            int ar[]=new int[m];
            ar=k.fib(m);
            for(int c=0;c<m;c++)
            {
            System.out.print(ar[c]+" ");
        } 
    }
}