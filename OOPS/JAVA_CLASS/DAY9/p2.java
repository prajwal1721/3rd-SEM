import java.util.Scanner;
class p2
{
    private float f;
    int a;
    String af;
    p2()
    {
        a=34;
        af="PRAJWAL";
    }
    p2(int a,String ase)
    {
      this.a=a;
      af=ase;
    }
    p2(int a,float s,String q)
    {
        this.a=a;
        af=q;
        this.f= s;

    }
    int p21(int a)
    {
        a=45;
        System.out.println(a+" "+af+" "+a);
        return 0;
    }
    int dispaly(float a)
    {
        a=46;
        System.out.println(a+" "+af+" "+a+" "+f);
        return 0;
    }
    public static void main(String args[])
    {
       int  ls=0;
        p2 l=new p2(2,242,"eam");
        l.p21(ls);
        int k=445;
        System.out.println(new p2().af+" "+k);
    }

}