import java.util.Scanner;
class l
{
public static void main(String args[])
{
    int ord=0,andd=0,xord=0,c=0;
   Scanner sc =new Scanner(System.in);
   ord= sc.nextInt();
   xord=sc.nextInt();
   andd=sc.nextInt();
    int f=(ord)*2;
    for(int i=1;i<=ord;i++)
    {
         for(int j=1;j<=ord;j++)
         {
           if(c==1)
             {
            
             }
            else if((i|j)==ord&&(i^j)==xord&&(i&j)==andd)
             {
                System.out.println(i +" "+ j);
                 c=1;
             }
         }
        }
    
            if(c==0)         
             {
                System.out.println("-1");
             }
}
}