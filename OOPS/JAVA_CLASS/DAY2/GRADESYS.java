import java.util.Scanner;
class GRADESYS
{
    public static void main(String args[])
    {
        int g,tot=0;
        float avg;
        Scanner sc= new Scanner(System.in);
        for(int i=1;i<=5;i++)
        {
            System.out.println("ENTER MARKS OF SUB"+i+":");
        g=sc.nextInt();
        tot=g+tot;
        }
        avg=tot/5;
        if(avg>90&&avg<=100)
        {
            System.out.println("GRADE A++\n");
        }
        else if(avg>80&&avg<=90)
        {
            System.out.println("GRADE A+\n");
        }
        else if(avg>70&&avg<=80)
        {
            System.out.println("GRADE A\n");
        }
        else if(avg>60&&avg<=70)
        {
            System.out.println("GRADE B++\n");
        }
        else if(avg>50&&avg<=60)
        {
            System.out.println("GRADE B+\n");
        }
        else if(avg>40&&avg<=50)
        {
            System.out.println("GRADE B\n");
        }
        else 
        {
            System.out.println("GRADE F\n");
        }
    }
}