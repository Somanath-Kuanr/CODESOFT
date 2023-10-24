import java.util.*;
class CurrencyConverter
{
    public void dollar(int amount)
    {
        System.out.println("dolar amount="+(double)amount/85.43);
    }
    public void Rongit(int amount)
    {
        System.out.println("Rupees amount="+amount/17.85);
    }
    public void won(int amount)
    {
        System.out.println("dolar amount="+amount*0.64);
    }
    public void rufiyaa(int amount)
    {
        System.out.println("dolar amount="+amount*0.053);
    }
    public static void main(String[] args) {
        CurrencyConverter ob=new CurrencyConverter();
        Scanner sc=new Scanner(System.in);
        System.out.println("Selct the targeted Currency:");
        System.out.println("1->Dollar"+"\n"+"2->Rongit"+"\n"+"3->Won"+"\n"+"4->Rufiyaa");
        int ch=sc.nextInt();
          System.out.println("Enter amount:");
          int a=sc.nextInt();
          if(ch==1)
          ob.dollar(a);
          else if(ch==2)
          ob.Rongit(a);
          else if(ch==3)
          ob.won(a);
          else if(ch==4)
          ob.rufiyaa(a);
          else
          System.out.println("Wrong choice");

    }
}