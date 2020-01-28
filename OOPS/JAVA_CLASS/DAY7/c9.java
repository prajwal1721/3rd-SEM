import java.util.Scanner;
class c9
{
    public int si(int m)
    {
        int i,sum=0;
        for( i=0;i<=m;i++)
        {
            sum=sum+i*i;
        }
        return sum;
    }
    public static void main(String args[])
    {
        Scanner sc= new Scanner(System.in);
        int n=sc.nextInt();
        c9 k=new c9();
        int s=k.si(n);    
        System.out.println(s);
    }


}