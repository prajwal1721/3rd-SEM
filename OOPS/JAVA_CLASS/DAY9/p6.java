import java.util.Scanner;
class p6
{
    int n;
    p6()
    {
        n=45;
    }
    p6(kq d)
    {
System.out.println(d.n);
    }
    class praj
    {
    void display(int n)
    {
        System.out.println(n);
    }
   }
}
class kq extends p6
    {
        kq()
        {}

    kq(kq d)
    {
System.out.println(d.n);
    }
        void display()
        {
            System.out.println("DNDV");
        }
         
        praj l=new praj(); 
    public static void main(String args[])
    {
        int  p =5;
        kq obj11 = new kq();
        p6 obj1=new p6();
        kq obj12 = new kq(obj11);
        obj11.display();
       // praj f=new praj();
        obj12.display();
    }
    }

