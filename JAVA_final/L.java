interface C
{
    public int res(int x,int y);
}
public class L
{
    public static void main(String[] args) {
        C m=(x,y)->(x*y);
        C ma=(x,y)->(x+y);
        System.out.println(m.res(2,3));
        System.out.println(ma.res(2,3));

    }
}