import java.util.Scanner;
class pp
{
    static int lp;
    int p;
    pp()
    {
        lp=45;
        System.out.println("ASSSASASASA");
        ma(p);
    }
    pp(int n)
    {
        lp=45;
        p=n;
    }
    pp(pp k)
    {
        lp=45;
        p=k.p;
    }
    public int ma(int p)
    {
       p=this.p+1;
       lp=lp-5;
        System.out.println("HI I AM EXECUTED"+p+" vd"+ lp);
    return p;
    }
}
class ya
{
    public static void main(String args[])
    {
        pp l1=new pp(56);
    pp l2=new pp(l1); 
    l1.ma(2);
    System.out.println(l2.p); 
    l2.ma(2); 

    pp l3=new pp();
    System.out.println(l3.p);
    l3.p=l2.p;
System.out.println(l3.p);
    }
}