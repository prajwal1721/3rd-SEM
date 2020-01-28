import java.util.Scanner;
class c5
{
    int i,p,sum;
    c5()
    {
         i=0;
         p=1;
         sum=0;
    }
    public int si(int m)
    {
        for( i=1;i<=m;i++)
        {
            sum=sum+i*p;
            p=p*(-1);
        }
        return sum;
    }
    public static void main(String args[])
    {
        Scanner sc= new Scanner(System.in);
        int n=sc.nextInt();
        c5 k=new c5();
        int s=k.si(n);    
        System.out.println(s);
    }


}