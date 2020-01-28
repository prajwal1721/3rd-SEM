import java.util.Scanner;
class hextobi
{
    public static void  main(String args[])
    {
        int sum=0,p=1;
       char l[]={'0','0','4','5','4'};
       int i=4;
       do
    {
        int po=(int)l[i];
        if(po>=65)
        {
            sum=sum+p*(po-55);
        }
        else
        {sum=sum+p*(po-48);}
        p=p*16;
        i--;
    }while(i>=0);
    long bi=0,lp=1;
    while(sum>0)
    {
        int r=sum%2;
        sum=sum/2;
        bi=bi+r*lp;
        lp=lp*10;
    }
    System.out.println(bi);

    }
}
