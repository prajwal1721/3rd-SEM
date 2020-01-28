import java.io.*;
import java.util.*;
 class Solution {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        int no;
        Scanner sc=new Scanner(System.in);
        no=sc.nextInt();
        for(int i=0;i<no;i++)
        {
            int n=sc.nextInt();
            int day=sc.nextInt();
            int arr[]=new int[n];
            for(int j=0;j<n;j++)
            {
             arr[j]=sc.nextInt();   }
            int st,sp;
           
            for(int p=0;p<day;p++)
            {
                st=sc.nextInt();
                sp=sc.nextInt();
                int sum=0;
               // System.out.println("LOOp"+(p+1));
                for(int k=(st-1);k<sp;k++)
              { 
              sum=sum+arr[k];
               
              }
                 int l=st;
                while(l<=sp)
              { 
             
                arr[l-1]=arr[l-1]+1;
                    l++;
              }
              for(int j=0;j<n;j++)
            {
                System.out.print(arr[j]+" "); }
              System.out.print(sum+" ");
              sum=0;
            }
       System.out.println();
        }
        
    }
}