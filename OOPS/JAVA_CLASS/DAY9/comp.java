
import java.util.Scanner;
class Te {
    public static void main(String args[] ) 
    {
        int test,no,temp;
        Scanner sc=new Scanner(System.in);
        test=sc.nextInt();
        for(int i=0;i<test;i++)
        {
            no=sc.nextInt();
            int arr[][]=new int[no][2];
            for(int j=0;j<no;j++)
            {
                for(int k=0;k<2;k++)
                {
                    arr[j][k]=sc.nextInt();
                }
            }
           for(int ip=0;ip<no-1;ip++)
            {
            for(int j=0;j<no-1-ip;j++)
            {
                
                    if(arr[j][0]>arr[j+1][0])
                    {
                        temp=arr[j][0];
                        arr[j][0]=arr[j+1][0];
                        arr[j+1][0]=temp;
                         temp=arr[j][1];
                        arr[j][1]=arr[j+1][1];
                        arr[j+1][1]=temp;
                    }
            }       
            }
                                 
            }
        }
            
    }