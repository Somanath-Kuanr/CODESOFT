import java.util.*;
class GradeCalculator
{
    public static void main(String a[])
    {
    Scanner sc =new Scanner(System.in);
    System.out.println("Enter the marks of 3 subject:");
    int m1=sc.nextInt();
    int m2=sc.nextInt();
    int m3=sc.nextInt();
    int total=m1+m2+m3;
    System.out.println("Total marks= "+total);
    double avg=total/3;
    System.out.println("Average marks= "+avg);
    char grade='O';
    if(avg>=90)
        grade='O';
    else if(avg>=80)
         grade='E';
    else if(avg>=70)
         grade='A';
    else if(avg>=60)
         grade='B';
    else if(avg>=50)
         grade='C';
    else if(avg>=40)
         grade='D';
    else
        System.out.println("Fail");
    System.out.println("Grade ="+grade);
    }
}