import java.util.*;
public class B8
{
    public static void main(String[] args) {
        String s;
        Scanner sc=new Scanner(System.in);
        s=sc.next();
        s=s.toLowerCase();
        StringBuffer ne=new StringBuffer(s);
        // System.out.println(s);
        for(int i=0;i<s.length();i++)
        {
            if(ne.charAt(i)=='a'||ne.charAt(i)=='e'||ne.charAt(i)=='i'||ne.charAt(i)=='o'||ne.charAt(i)=='u')
                ne.setCharAt(i,(char)(ne.charAt(i)+1));
        }
        System.out.println(ne);
    }
}