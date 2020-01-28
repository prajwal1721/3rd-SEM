class inherit
{
    void si()
    {
        System.out.println("INHERIT1\n");
    }
}
class di1 extends inherit
{

    void si()
    {
        System.out.println("INHERIT2\n");
    }

}
class di2 extends di1
{

    void si()
    {
        System.out.println("INHERIT3\n");
    }

}
class di3 extends di2
{

    void si()
    {
        System.out.println("INHERIT3\n");
    }
public static void main(String args[])
{
    di3 l =new di3();
    l.si();
}
}

