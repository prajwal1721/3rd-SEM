class ClassA 
{
    public void dispA()
    {
        System.out.println("disp() method of ClassA");
    }
}
interface InterfaceB 
{
    public void show();
}
 interface InterfaceC 
{
    public void showa();
}
class ClassD extends ClassA implements InterfaceB,InterfaceC
{
    public void show()
    {
        System.out.println("show() method implementation");
    }
    public void showa()
    {
        System.out.println("showa() method implementation");
    }
    public void dispD()
    {
        System.out.println("disp() method of ClassD");
    }
    public static void main(String args[])
    {
        ClassD d = new ClassD();
        d.dispD();
        d.show();
        d.showa();
    }
}