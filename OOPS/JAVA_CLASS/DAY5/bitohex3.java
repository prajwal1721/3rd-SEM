import java.util.Scanner;
class bitohex3
{
    public static void main(String args[])
    {
        long bi,dec=0,p=1;
        Scanner  sc=new Scanner(System.in);
        bi =sc.nextLong();
   do
        {
            long r=bi%10;
            bi=bi/10;
            dec=dec+p*r;
            p=p*2;
        }     while(bi>0);
        char arr[]=new char[6];    
        int i=5;

      while(dec>=0&&i>=0)
      {
          long re;
          re=dec%16;
          dec=dec/16;
          if(re>=10)
          {
              re=re-10;
              
              arr[i]=(char)(re+65);
          }
          else
          {
              arr[i]=(char)(re+48);
          }
        i--;
        }
      System.out.print("0x");
      i=0;
      do
      {
          System.out.print(arr[i]);
         i++;
        }while(i<6);
      System.out.println("");
        sc.close();

}
}