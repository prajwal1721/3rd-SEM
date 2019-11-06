class finalz
{
    public static void main(String[] args) {
        A a=new A(8  );
        a=null;
        System.gc();
    }
}
class A
{
    int n;
    A()
    {
        System.out.println("In A");
    }
    A(int n)
    {
                System.out.println("In A with n");
        this.n=n;
    }

    protected void finalize() {
        System.out.println("in finalize");
    }
}