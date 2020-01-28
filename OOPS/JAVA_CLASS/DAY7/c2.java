import java.util.Scanner;
class c2
{
    public int[] greater(int[] arr,int n)
    { 

        for(int i=0;i<n;i++)
        {
            for(int j=0;j<n-1;j++)
            {
                if(arr[j]<arr[j+1])
                {
                   int temp=arr[j];
                   arr[j]=arr[j+1];
                   arr[j+1]=temp;
                }
            }
        }
        return arr;
    }
    public static void main(String args[])
    {
       
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int arr1[]=new int[n];
        for(int i=0;i<n;i++)
        {
            arr1[i]=sc.nextInt();
        }
        c2 na= new c2();
        arr1=na.greater(arr1,n);
        for(int i=0;i<n;i++)
        {
            System.out.print(arr1[i]+" ");
        }
        System.out.println("");
        sc.close();
    }

}