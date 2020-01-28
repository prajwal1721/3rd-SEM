import java.util.Scanner;

class p1
{
   
    public int a;
    protected  int b;
    private int c;
    p1()
    {
        a=45;
        b=15;
        c=3;
    }
    p1(int n)
    {
        a=45;
        b=n;
        c=3;
    }
    private int as()
    {
        int cs=a+b-c;
        ad();
        System.out.println("PRIVATE"+cs);
        return 0;
        
    }
    public int test()
    {
        System.out.println("COMPLETED dd"); 
        as();//calling private
        System.out.println("PUBLIC METHOD CALL"+(a+b+c));
        return a * b * c;
            }
 
    public void s()
    {
      as();//calling private
    }
    protected int ad()
{
    as();// calling private
    System.out.println("COMPLETED"); 
    System.out.println("PROTECTED "+a);
    return 0;
}
}
class q extends p1
{
   static  
    {
    System.out.println("HI I AM EXECUTED");
    }

    public void l()
{ 
    ad();
    System.out.println("MAIN cidsvid");
}
    public static void main(String args[])
    {
    int a;
    q s=new q();
    System.out.println("COMPLEdvd  nd  d"); 
    a=s.test();
    s.ad();
    System.out.println("COMPLETED"+a+" djcdsv "+s.b);  
    p1 sa =new p1(8);
    System.out.println("P1");  
    a=sa.test();
    //sa.ad();
    System.out.println("COMPLETED 2  "+a);  
    s.l();
}
}