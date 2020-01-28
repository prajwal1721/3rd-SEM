import java.util.Scanner;
class c7
{
    public int si(int m)
    {
        int i,sum=0;
        for( i=0;i<=m;i++)
        {
            sum=sum+i;
        }
        return sum;
    }
    public static void main(String args[])
    {
        Scanner sc= new Scanner(System.in);
        int n=sc.nextInt();
        c7 k=new c7();
        int s=k.si(n);    
        System.out.println(s);
    }


}