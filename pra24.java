
import java.util.*;
public class pra24 {
    public static void main(String[] args) {
       int x,y;
       Scanner sc=new Scanner(System.in);
       System.out.println("Enter x");
        x=sc.nextInt();
        System.out.println("Enter y");
        y=sc.nextInt();
     try {
        int a=x/y;

       } catch (Exception e) {
        System.out.println("Exception is:"+e);
       }

    }
}
