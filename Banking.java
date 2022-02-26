class Banking
{
  public static void main(String args[])
  {
    Account a=new Account();
    Deposit d=new Deposit(a);
    Withdraw w=new Withdraw(a);
    d.start();
    w.start();
  }
}
class Account
{
  int amount=500;
  if(this.amount<amount)
  {
    try
    {
      wait();
    }
    catch(Exception e)
    {
      System.out.println(e);
    }
  }
  this.amount-=amount;
  if(this.amount>amount)
  {
    System.out.println("Withdraw completed");
    System.out.println("Available Balance:"+this.amount);
  }
  else
  {
    System.out.println("Low Balance");
    System.out.println("Not available to withdraw");
  }
}
synchronized void deposit(int amount)
{
  this.amount+=amount;
  System.out.println("Deposit Completed");
  System.out.println("Available Balance:"+this.amount);
  notify();
}
class Deposit extends Thread
{
  Account a;
  Deposit(Account a)
  {
    this.a=a;
  }
  public void run()
  {
    a.deposit(10000);
  }
 }
 class Withdraw extends Thread
 {
  Account a;
  Withdraw(Account a)
  {
    this.a=a;
  }
  public void run()
  {
    a.withdraw(25000);
  }
 }
  
    
