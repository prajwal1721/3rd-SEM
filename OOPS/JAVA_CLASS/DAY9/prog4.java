class A
{
    A getA()
    {
        return this;
    }
    void m()
    {
        System.out.println("HI");
    }
}
class test
{
    public static void main(String args[])
{
    //A o=new A();
   // o.getA();
     new A().getA().m();
}

}