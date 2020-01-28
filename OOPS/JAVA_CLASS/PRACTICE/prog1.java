import java.lang.String;
class prog11
{
   
    public static void main(String args[])
    {
        for(int i=0; i<args.length; i++)
        System.out.println("args[" + i + "]: " +
        args[i]);

        sw dq =new sw();
        System.out.println("MAIN method");
      new  sw().sss();    
       new sw().sss();    
    }
}
   class sw
{
    String s=" gggggg",ss="DEO ",l="dsddddd"+"  TANVI "+ss;
    static int ld;
    int a;
    sw()
    {
        s="dsddddd"+"  TA "+ss;
        ld= 5;
    a=45;
    }
    static 
    {
        System.out.println("STATIC BLOCK");
    }
 
 void sss()
    {
        ld+=1;
        System.out.println("SS"+" "+ld+s+" "+s.equals(l)+"s"+s.length()+"  "+s.charAt(9));
    }
void ms()
{
    System.out.println("SS"+" "+ld+" d"+ ++a);
}
}