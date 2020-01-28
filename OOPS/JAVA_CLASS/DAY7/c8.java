import java.util.Scanner;
class c8
{
    public void si(int m)
    {
        int i,sum=0;
        for( i=1;i<=m;i++)
        {
            sum=sum+i*i;
        }
        System.out.println(sum);
    }
    public static void main(String args[])
    {
        Scanner sc= new Scanner(System.in);
        int n=sc.nextInt();
        c8 k=new c8();
        k.si(n);    
    }


}