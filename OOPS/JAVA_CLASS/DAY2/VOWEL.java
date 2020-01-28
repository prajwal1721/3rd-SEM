import java.util.Scanner;
class VOWEL
{
    public static void  main(String arg[])
    {
        String c;
        Scanner sc = new Scanner(System.in);
       c=sc.nextLine();
        if(c=="a"||c=="e"||c=="i"||c=="o"||c=="u"||c=="A"||c=="E"||c=="I"||c=="U"||c=="O")
        {
            System.out.println("VOWEL\n");
        }
        else
        {
            System.out.println("CONSONENT\n");
        }
    }
}