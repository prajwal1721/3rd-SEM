import java.util.Scanner;
class hextodec2
{
    public static void  main(String args[])
    {
        int sum=0,p=1;
       char l[]={'A','1','3','5','B'};
       int i=4;
       while(i>=0)
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
    }
       System.out.println(sum);
    }
}
