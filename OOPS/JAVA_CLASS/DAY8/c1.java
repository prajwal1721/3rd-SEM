import java.util.Scanner;
class c1
{
   public int a,i;
    public c1()
    {
        a=0;
    }
    
    public int prime(int n)
    {
        for(i=2;i<n;i++)
        {
        if(n%i==0)
        {a=1;
          break;
        }
    }
    return a;
    }
    public static void main(String args[])
    {
        c1 l=new c1();
        int k;
        Scanner sc= new Scanner(System.in);
        k=sc.nextInt();
        int p=l.prime(k);
       if(p==1)
       {
           System.out.println("NOT PRIME\n");
       }
       else
       {
        System.out.println("PRIME\n");
    }
        sc.close();

    } 
}