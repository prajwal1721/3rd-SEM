class  prog1
{
  public int g=5;
  private int  b=95;
  protected int c=6;
  public void pub()
  {System.out.print("PUBLIC :   ");
      pr();
    System.out.println(g+" pub pri"+b+" prot"+c+"END \n ");
  }
  private void pr()
  {
    System.out.println("llllllllll"+g+" pub pri"+b+" prot"+c);
  }
  protected void pt()
  {
    System.out.print("PROTCTED :   ");
   
      pr();
    System.out.println("aaaaaaa"+g+" pub pri"+b+" prot"+c);
  }

}
class aaaa extends prog1{}
class cprog3 extends aaaa
{
  public static void main(String args[])
  {
      cprog3 o1=new cprog3();
      o1.pub();
 //     o1.pr();
      o1.pt();
   System.out.println(o1.c);

  }
 
}