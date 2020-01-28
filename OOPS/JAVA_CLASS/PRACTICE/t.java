import java.io.*;
import java.util.*;
import java.lang.*;
class Solution {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
    String s;
        int j=0;
        Scanner sc=new  Scanner(System.in);
        s=sc.nextLine();
        int n=s.length();
        String a="";        for(int i=0;i<n;i++)
        {
            if(Character.isLetter(s.charAt(i)))
            {
                a=a+s.charAt(i);j++;
            }
        }
        
        int r,c,d1;
        double d2=Math.sqrt(j);d1=(int)d2;
        if(d1!=d2)
        {r=d1;c=d1+1;}
        else
        {  r=d1;c=d1;}
    System.out.println(r + " "+c);
    //System.out.println(r + " "+c);

 //for(int i=0;i<j;i++)
 {System.out.print(a);
    }
}
}