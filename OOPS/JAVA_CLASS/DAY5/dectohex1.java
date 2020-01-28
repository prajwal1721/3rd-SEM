import java.util.Scanner;
class dectohex1
{
    public static void  main(String args[])
    {
        int na=10,n;
        Scanner sc= new Scanner(System.in);
        n=sc.nextInt();
      char arr[]=new char[na];    


      for(int i=9;n>0&&i>=0;i--)
      {
          int r=0;
          r=n%16;
          n=n/16;
          if(r>=10)
          {
              r=r-10;
              
              arr[i]=(char)(r+65);
          }
          else
          {
              arr[i]=(char)(r+48);
          }
      }
      System.out.print("0x");
      for(int i=0;i<10;i++)
      {
          System.out.print(arr[i]);
      }
      System.out.println("");
    }
}