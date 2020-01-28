import java.util.Scanner;
class EMP
{
    public static void main(String args[])
    {
        int avg;
        double sal;
        Scanner sc= new Scanner(System.in);
            System.out.println("NUMBER OF YEARS OF EXP\n");
        avg=sc.nextInt();
        sal=sc.nextDouble();
        if(avg>1&&avg<=3)
        {
            sal=sal*(1.1);
            System.out.println("HIKE 10%\nsal is:"+sal);
        }
        else if(avg>3&&avg<=5)
        {
            sal=sal*1.15;
            System.out.println("HIKE 15%\nsal is:"+sal);
        }
        else if(avg>5&&avg<=7)
        {
            sal=sal*1.2;
            System.out.println("HIKE 20%\nsal is:"+sal);
        }
        else if(avg>7&&avg<=10)
        {
            sal=sal*1.25;
            System.out.println("HIKE 25%\nsal is:"+sal);
        }
        else 
        {
            sal=sal*1.3;
            System.out.println("HIKE 30%\nsal is:"+sal);
        }
    }
}