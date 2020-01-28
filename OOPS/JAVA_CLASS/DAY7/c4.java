import java.util.Scanner;
class c4
{
    public void grade(int[] arr)
    {
        int sum=0;
        for(int i=0;i<5;i++)
        {
            sum=sum+arr[i];
        }
        float avg=sum/5;
        int l=100,n=90,m=65;
        for(int i=0;i<5;i++)
        {
            if(avg<l&&avg>=n)
            {
                System.out.println((char)m);
            }
            l=l-10;n=n-10;m++;
        }
    }
   
    public static void main(String args[])
    {
        int ae[]=new int[5];
        Scanner sc=new Scanner(System.in);
        for(int i=0;i<5;i++)
        {
            ae[i]=sc.nextInt();
        }
        c4 l=new c4();
        l.grade(ae);
        sc.close();
    }
}