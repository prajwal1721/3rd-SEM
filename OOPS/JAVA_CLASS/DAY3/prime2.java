import java.util.Scanner;
class prime2
{
    public static void main(String agrs[])
    {
        int i=1,n,flag=1;
        Scanner sc= new Scanner(System.in);
        n=sc.nextInt();
        while(i<n/2)
        {
            if(n/i==0)
            {
              flag=0;
            }
            i++;
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