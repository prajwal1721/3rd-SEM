import java.util.Scanner;
class G4
{
    public static void main(String args[])
    {
        int a,b,c,d;
        Scanner sc=new Scanner(System.in);
        a=sc.nextInt();
        b=sc.nextInt();
        c=sc.nextInt();
        d=sc.nextInt();
       
       if(a>b)
       {
           if(a>c)
           {
               if(a>d)
               {
                   System.out.println(a);
               }
               else
               {
                   System.out.println(d);
                }
            }

            else
            {
                if(c>d)
                {
                    System.out.println(c);
                }
                else
                {
                    System.out.println(d);
                }
            }
        }       
    
        else
        {
            if(b>c)
            {
               if(b>d)
               {
                System.out.println(b);
               }
               else
               {
                System.out.println(d);
               }
            }
            else
            {
                if(c>d)
                {
                    System.out.println(c);
                }
                else
                {
                    System.out.println(d);
                }
            }

        } 

       

    }
}