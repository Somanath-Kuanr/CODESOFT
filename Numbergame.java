import java.util.*;
class C1
{
       int c=1;
      void check(int ran)
     {
        Scanner sc1=new Scanner(System.in);
        for(int i=0;i<10;i++)
        {
            System.out.println("Enter the Guess no:");
            int g=sc1.nextInt();
            if(g==ran)
            {
                System.out.println("Your guess is correct");
                System.out.println("Number of attempts :"+c);
                break;
            }
            if(g>ran)
            {
                System.out.println("Your guess is too high");
                c++;
            }
            if(g<ran)
            {
                System.out.println("Your guess is too low");
                c++;
            }
        }
}
}
class Numbergame
{
    public static void main(String a[])
    {
        C1 ob=new C1();
        Scanner sc=new Scanner(System.in);
        int max=100;
        int min=1;
        double r=Math.random();
        int ran=(int)(r*(max-min))+min;
        ob.check(ran);
        System.out.println("Do you want to play again:Y/N");
        char ch=sc.next().charAt(0);
        {
            if(ch=='Y'){
                ob.check(ran);
            }
            Scanner.close();
        }
        
        

        }
        

    }
