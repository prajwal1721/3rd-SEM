import java.util.Scanner;
class prime3
{
    public static void main(String agrs[])
    {
        int i=1,n,flag=1;
        Scanner sc= new Scanner(System.in);
        n=sc.nextInt();
        do
        {
            if(n/i==0)
            {
              flag=0;
            }
            i++;
        }while(i<=n/2);
        if(flag==1)
        {
            System.out.println("PRIME");;
        }
        else
        {
            System.out.println("NOT PRIME");
        }
    }
}