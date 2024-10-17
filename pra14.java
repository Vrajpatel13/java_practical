import java.util.*;
public class pra14
{
    int month,day,year,d,m,y;

    pra14(int m,int d,int y)
    {
        month=m;
        day=d;
        year=y;
    }
    public void get()
    {
        System.out.println("Enter day:");
        Scanner sc=new Scanner(System.in);
         d=sc.nextInt();
        System.out.println("Enter month:");
       m=sc.nextInt();
        System.out.println("Enter year:");
        y=sc.nextInt();

    }
    public int getmonth()
    {
        return month;
    }
    public  int getday()
    {
        return day;
    }
    public int getyear()
    {
        return year;
    }
    public void display()
    {
        System.out.println("The date using constructor is: ");
        System.out.println(day+"/"+month+"/"+year);
        
        System.out.println("The date using method is: ");
        System.out.println(d+"/"+m+"/"+y);

    }
    public static void main(String[] args) {
        pra14 obj=new pra14(11,21,2005);
        int p,q,r;
        int a=obj.getday();
        System.out.println("Day: "+a);
        int b=obj.getmonth();
        System.out.println("Month: "+b);
        int c=obj.getyear();
        System.out.println("Year: "+c);
        obj.get();
         obj.display();

        }

    }
    