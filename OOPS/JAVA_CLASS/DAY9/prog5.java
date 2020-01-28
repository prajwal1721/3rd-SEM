//interface
class a1
{
    int i;
    a1()
    {
        i=45;
    }
    void m()
    {
        System.out.println("A1 4 "+i);
    }
}
class a2
{
    void pr()
{
    System.out.println("HI");
}
}
interface b1 
{
    public void Disp();
}

interface b3 
{
    public void Disp1();
}
interface b2
{
    public void Disp2();
}
class a3 extends a1 implements b1,b2,b3
{
   public void Disp()
    {
        System.out.println("A1 1");
    }
    public void Disp1()
    {
        System.out.println("A1 1");
    }
    public void Disp2()
    {
        System.out.println("A1 1");
    }
    void my()
    {
        System.out.println("A1 3");
    }
    public static void main(String args[])
    {
        a3 ob= new a3();
        ob.Disp();
        
        ob.m();
        ob.my();
    }
}