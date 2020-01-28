import java.util.Scanner;
class c6
{
    public void si(int m)
    {
        int i,sum=0;
        for( i=0;i<=m;i++)
        {
            sum=sum+i;
        }
        System.out.println(sum);
    }
    public static void main(String args[])
    {
        Scanner sc= new Scanner(System.in);
        int n=sc.nextInt();
        c6 k=new c6();
        k.si(n);    
    }


}