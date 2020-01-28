import java.util.*;
class B9
{
    public static void main(String[] args) {
        String s;
        Scanner sc=new Scanner(System.in);
        s=sc.nextLine();
        s=s.toUpperCase();
        char ch;
        int count=0;
        ch=s.charAt(0);
        for(int i=1;i<s.length();i++)
        {
            if(s.charAt(i)==ch)
                count++;
            ch=s.charAt(i);
        }
        System.out.println(s);
        System.out.println(count);
        sc.close();
    }
}