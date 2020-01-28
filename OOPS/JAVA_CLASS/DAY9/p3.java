import java.util.Scanner;
class p3
{
    public static void main(int n)
    {
        System.out.println("OVERLOAD "+n);
    }
    public static void main(String args[] )
    {
        Scanner sc= new Scanner(System.in);
        int n=sc.nextInt();
        System.out.println(n);
        sc.close();
    }
}   