import java.util.Scanner;
class p1a
{
    public static void main(String[] args) {
        float p,n,r;
        Scanner sc=new Scanner(System.in);
        p=sc.nextFloat();
        n=sc.nextFloat();
        r=sc.nextFloat();
        float si=p*n*r/100;
        System.out.println("SI IS :"+si); 
    }
}