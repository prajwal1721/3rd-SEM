import java.util.Scanner;
class hextobi
{
    public static void  main(String args[])
    {
        int sum=0,p=1;
       char l[]={'A','1','3','5','B'};
    for(int i=4;i>=0;i--)
    {
        int po=(int)l[i];
        if(po>=65)
        {
            sum=sum+p*(po-55);
        }
        else
        {sum=sum+p*(po-48);}
        p=p*16;
    }
       System.out.println(sum);
    }
}
