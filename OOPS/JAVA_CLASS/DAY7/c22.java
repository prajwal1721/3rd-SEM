import java.util.Scanner;
class c22
{
    public void bitohex(int l)
    {
        int n=0,p=1;
        for(;l>0;)
        {
            int r=l%10;
            l=l/10;
            n=n+p*r;
            p=p*2;
        }
        char arr[]={0,0,0,0,0,0,0,0};
        for(int i=7;n>0;i--)
        {
            int r=0;
            r=n%16;  
            n=n/16;
           if(r<10)
           {
               arr[i]=(char)(48+r);
           }
           else
           {
               arr[i]=(char)(55+r);
           }
        }
        System.out.print("0x");
        for(int i=0;i<8;i++)
        {
            System.out.print(arr[i]);
        }
        System.out.println("");
        
    }
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        c22 s=new c22();
        s.bitohex(n);
        sc.close();
    }
}