class prog2
{
    int a;
    char b;
    float c;
    prog2()
    {
     a=45;b='a';c=56;   
    }
    prog2(int n)
    {
        this();
        a=n;
    }
    prog2(int n,char b,float c )
    {
        this();
        a=n;
        this.b=b;
        this.c=c;
    }
public void disp()
{
    System.out.println(a+" "+b+" "+c);
}
    public static void main(String args[])
   { 
       int n=8;
       char l='t';
       float p=59;
 prog2 ob=new prog2();
 prog2 ob1=new prog2(n);
 prog2 ob2=new prog2(n,l,p);
 ob.disp();
 ob1.disp();
 ob2.disp();
}
}