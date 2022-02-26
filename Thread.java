import java.util.*;
class Thread
{
  public static void main(String args[])throws Exception
  {
    Thread1 t1=new Thread1();
    t1.start();
  }
}
class Thread1 extends Thread
{
  public void run()
  {
    int i,n,l;
    Scanner sc=new Scanner(System.in);
    System.out.println("Enter number of random integers to be inserted");
    n=sc.nextInt();
    System.out.println("Enter the time limit after which the element to be replaced");
    l=sc.nextInt();
    Random r=new Random();
    for(i=0;i<n;i++)
    {
      int random;
      System.out.println("Random integer is:");
      random=r.nextInt(l);
      if(random%2==0)
      {
        Square s=new Square(random);
        s.start();
      }
      else
      {
        Cube c=new Cube(random);
        c.start();
      }
      try
      {
        Thread.sleep(1000);
      }
      catch(Exception e)
      {
        System.out.println(e);
      }
     }
    }
   }
 class Square extends Thread
 {
  int n;
  Square(int n)
  {
    this.n=n;
  }
  public void run()
  {
    System.out.println("Square of"+this.n+"is"+(this.n*this.n));
  }
 }
 class Cube extends Thread
 {
  int n;
  Cube(int n)
  {
    this.n=n;
  }
  public void run()
  {
    System.out.println("Cube of"+this.n+"is"+(this.n*this.n*this.n));
  }
 }
}
