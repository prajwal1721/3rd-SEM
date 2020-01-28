import java.util.Scanner;

class rdia
{
    public static void main(String args[])
     {
         int arr1[][]=new int[3][3];
         int arr2[][]=new int[3][3];
         int sum=0;
        Scanner sc=new Scanner(System.in); 
        for(int i=0;i<3;i++)
        {
            for(int j=0;j<3;j++)
            {
            arr1[i][j]=sc.nextInt();

            }
        }
        for(int i=0;i<3;i++)
        {
            sum=sum+  arr1[i][2-i];
        }
           System.out.println(sum); 
    }    


    }
