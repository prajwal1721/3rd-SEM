import java.util.Scanner;
class c2
{
    public int sum,flag;
    c2()
    {
        flag=0;
      sum=0;
    }
    public void grade(int[] arr)
    {
        
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
            flag =1;
            }
            l=l-10;n=n-10;m++;
        }
        if(flag==0)
        {
            System.out.println("FAIL");
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
        c2 l=new c2();
        l.grade(ae);
        sc.close();
    }
}