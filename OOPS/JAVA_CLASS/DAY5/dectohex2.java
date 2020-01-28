import java.util.Scanner;
class dectohex2
{
    public static void  main(String args[])
    {
        int na=10,n;
        Scanner sc= new Scanner(System.in);
        n=sc.nextInt();
      char arr[]=new char[na];    
      for(int i=9;i>0;i--)
      {
          arr[i]=(char)48;
      }
      int i=9;;
      while(n>0&&i>=0)
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
          i--;
      }
      System.out.print("0x");
      i=0;
      while(i<10)
      {
          System.out.print(arr[i]);
          i++;
      }
      System.out.println("");
    }
}