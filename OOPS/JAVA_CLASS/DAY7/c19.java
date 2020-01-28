import java.util.Scanner;
class c19
{
    public void dectohex(int n)
    {
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
        c19 s=new c19();
        s.dectohex(n);
    }
}