interface F
{
    public int n=34;
    public void Show();
    // {
    //     System.out.println(n);
    // }
}
class A implements F
{
    A()
    {
    System.out.println(n+" ");
    }
    public void Show()
    {
         System.out.println(n +"Changing n ");
    }
}
class M
{
    public static void main(String[] args) {
        A a= new A();
        a.Show();
    }
}
