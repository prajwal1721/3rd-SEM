import java.util.Scanner;
class G6a
{
  public static void main(String[] args)
   {
    int a,b,c,d,e,f;
    Scanner sc=new Scanner(System.in);
   { a=sc.nextInt();
    b=sc.nextInt();
    c=sc.nextInt();
    d=sc.nextInt();
    e=sc.nextInt();
    f=sc.nextInt();
   }
   if(a>b&&a>c&&a>d&&a>e&&a>f)
   {
       System.out.println(a);
   }
   else if(a<b&&b>c&&b>d&&b>e&&b>f)
   {
       System.out.println(b);
   }
   else if(c>b&&a<c&&c>d&&c>e&&c>f)
   {
       System.out.println(c);
   }
   else if(d>b&&d>c&&a<d&&d>e&&d>f)
   {
       System.out.println(d);
   }
   else if(e>b&&e>c&&e>d&&a<e&&e>f)
   {
       System.out.println(e);
   }
   else if(f>b&&f>c&&f>d&&f>e&&a<f)
   {
       System.out.println(f);
   }    
    }
}