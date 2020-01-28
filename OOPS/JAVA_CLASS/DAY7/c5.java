import java.util.Scanner;
class c5
{
    public float gradel(float[] arr)
    {
        float sum=0;
        for(int i=0;i<5;i++)
        {
            sum=sum+arr[i];
        }
        float avg=(float)(sum/5);
         return avg;
    }
   
    public static void main(String args[])
    {
    float fl;
        float ae[]=new float[5];
        Scanner sc=new Scanner(System.in);
        for(int i=0;i<5;i++)
        {
            ae[i]=sc.nextInt();
        }
        c4 l=new c4();
        float lp=100,n=90,m=65;
        fl=l.gradel(ae);
        for(int i=0;i<5;i++)
        {
            if(fl<lp&&fl>=n)
            {
                System.out.println((char)m);
            }
            lp=lp-10;n=n-10;m++;
        }
        sc.close();
    }
}