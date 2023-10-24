import java.util.*;
interface Atm
{
    void withdraw(int amount);
    void deposit(int amount);
    void checkBalance();
}
class Opertaion implements Atm
{
    public static int balance=10000;
    public void withdraw(int amount)
    {
        if(balance>=amount)
            System.out.println("Success");
        else
        {
            System.out.println("Fail");
            System.out.println("You don't have Sufficent Balance");
        }     
    }
    public void deposit(int amount)
    {
        balance+=amount;
        System.out.println("Amount deposited successfully");
    }
    public void checkBalance()
    {
        System.out.println("Availble Balance: "+balance);
    }

}
class ATMINTERFACE
{
   public static void main(String a[])
   {
    Opertaion op=new Opertaion();
    Scanner sc=new Scanner(System.in);
    System.out.println("your account balance=10000");
    System.out.println("Enter choice:");
    System.out.println("1->withdraw"+"\n"+"2->deposit"+"\n"+"3->check balance");
    int n=sc.nextInt();
    if(n==1)
    {
        System.out.println("Enter amount:");
        int amount=sc.nextInt();
        op.withdraw(amount);
    }
    else if(n==2)
    {
        System.out.println("Enter amount:");
        int amount=sc.nextInt();
        op.deposit(amount);
    }
    else if(n==3)
    {
        op.checkBalance();
    }
    else
    System.out.println("wrong choice...........");
   } 
}
