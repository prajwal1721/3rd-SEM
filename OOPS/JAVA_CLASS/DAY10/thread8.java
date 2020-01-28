import java.lang.Runnable;
class thread8
{
    public static void main(String args[])
    {
        hel obj= new hel();
     Thread th= new Thread(obj);
      th.start();
    }
}
class hello
{
    public void run()
    {
        downloadfile();
    }
  public   void downloadfile()
    {
        System.out.println("HI DOWNLOAD COMPLETE");
    }
}
class hel extends hello implements Runnable
{
}