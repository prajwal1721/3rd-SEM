interface Calc{
    public int res(int x,int y);
    }
     class Lambda{
    public static void main(String args[])
    {
    Calc a=(x,y)->(x+y);
    System.out.println("\nSUM IS:"+a.res(2,3));
    Calc ms=(x,y)->(x-y);
    System.out.println("\nPRODUCT IS:"+ms.res(3,4));
    Calc m=(x,y)->(x*y);
    System.out.println("\nPRODUCT IS:"+m.res(3,4));
    }
    }