import java.util.Scanner;
class G7a
{
  public static void main(String[] args)
   {
    int a,b,c,d,e,f,h;
    Scanner sc=new Scanner(System.in);
   { a=sc.nextInt();
    b=sc.nextInt();
    c=sc.nextInt();
    d=sc.nextInt();
    e=sc.nextInt();
    f=sc.nextInt();
    h=sc.nextInt();
   }
   if(a>b&&a>c&&a>d&&a>e&&a>f&&a>h)
   {
       System.out.println(a);
   }
   else if(a<b&&b>c&&b>d&&b>e&&b>f&&b>h)
   {
       System.out.println(b);
   }
   else if(c>b&&a<c&&c>d&&c>e&&c>f&&c>h)
   {
       System.out.println(c);
   }
   else if(d>b&&d>c&&a<d&&d>e&&d>f&&d>h)
   {
       System.out.println(d);
   }
   else if(e>b&&e>c&&e>d&&a<e&&e>f&&e>h)
   {
       System.out.println(e);
   }
   else if(f>b&&f>c&&f>d&&f>e&&a<f&&f>h)
   {
       System.out.println(f);
   }
   else
   {
        System.out.println(h);
   }
        
    }
}