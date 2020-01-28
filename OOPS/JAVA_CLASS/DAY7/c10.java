import java.util.Scanner;
class c10
{
    public int si(int m)
    {
        int i,p=1,sum=0;
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
        c10 k=new c10();
        int s=k.si(n);    
        System.out.println(s);
    }


}