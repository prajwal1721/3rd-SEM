import java.util.Scanner;
class c4
{
    public int i,sum;
    c4()
    {
        i=0;
        sum=0;
    }
    public void si(int m)
    {
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
        c4 k=new c4();
        k.si(n);    
    sc.cl`ose();
    }


}