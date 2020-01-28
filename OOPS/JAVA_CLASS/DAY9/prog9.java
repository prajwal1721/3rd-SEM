import java.util.Scanner;
class prog9 
{
    int h;
    prog9 obj;
    prog9()
    {
      
    //    System.out.println("SUB");
    }
    prog9(int h)
    {
        this();
        this.h=5;
        h=this.h+6;
System.out.println(h);
    }
    prog9(prog9 obj)
    {
        this.obj=obj;
System.out.println(h);
    }
    void  m(prog9 d)
    {
        System.out.println("PF");
    }
    void ma()
    {
        m(this);
    }
    public static void main(String args[])
    {
        prog9 s=new prog9(9); 
      prog9 l=new prog9(s);
      System.out.println("OBJ CREATED");
     System.out.println("CALL");
     l.ma();
     System.out.println(new prog9().h);
    }
}
class p
{
    static{
    System.out.println("P IS CALLED");
}
}