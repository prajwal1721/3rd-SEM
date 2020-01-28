import java.util.Scanner;
class prime1
{
    public static void main(String agrs[])
    {
        int n,flag=1;
        Scanner sc= new Scanner(System.in);
        n=sc.nextInt();
        for(int i=1;i<n/2;i++)
        {
            if(n/i==0)
            {
              flag=0;
            }
        }
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