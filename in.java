interface A
{
   public void diap();
}
class B
{
    B()
    {
        System.out.println("ff");
    }
}
class C extends B  implements A
{
   public void diap()
    {
        System.out.println("hi...");
    }
}
class d
{
    public static void main(String[] args) {
        C c=new C();c.diap();
    }
}