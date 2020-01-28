import java.util.Scanner;
class c3
{
    public int i,sum;
    c3()
    {
        i=0;sum=0;
    } 
    public void si(int m)
    {
        
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
        c3 k=new c3();
        k.si(n);    
    }


}