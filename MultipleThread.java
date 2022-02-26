class MultipleThreads
{
  public static void main(String args[])throws Exception
  {
    try
    {
      Odd o=new Odd();
      Even e=new Even();
      o.start();
      o.join();
      e.start();
    }
    catch(Exception e)
    {
      System.out.println(e);
    }
  }
}
class Odd extends Thread
{
  public void run()
  {
    try
    {
      System.out.println("Odd numbers between 1 and 100 are:");
      int i;
      for(i=0;i<=100;i++)
      {
        if(i%2==0)
        {
          System.out.println(i);
        }
      }
      catch(Exception e)
      {
        System.out.println(e);
      }
     }
    }
 class Even extends Thread
{
  public void run()
  {
    try
    {
      System.out.println("Even numbers between 1 and 100 are:");
      int i;
      for(i=0;i<=100;i++)
      {
        if(i%2==0)
        {
          System.out.println(i);
        }
      }
      catch(Exception e)
      {
        System.out.println(e);
      }
     }
    }



