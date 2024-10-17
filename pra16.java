import java.util.*;
public class pra16 {
    double real;
     double img;

  

    // addition
    public void add(int r1,int im1,int r2,int im2) {
       int r,im;
       r= r1+r2;
       im= im1+im2;
       System.out.println("Sum= "+r+"+"+im+"i");
    
    }

    //  subtraction
    public void sub(int r1,int im1,int r2,int im2) {
        int r,im;
        r= r1-r2;
        im= im1-im2;
        if(im<0)
        System.out.println("Subtraction= "+r+im+"i");
        else
        System.out.println("Subtraction= "+r+"+"+im+"i");

     
     }
     public void mul(int r1,int im1,int r2,int im2) {
      int r,im;
      r= r1*r2-im1*im2;
      im= r1*im2+im1*r2;
      System.out.println("Multiplication= "+r+"+"+im+"i");
   
   }
  
  public static void main(String[] args) {
     
      Scanner sc=new Scanner(System.in);
      System.out.println("Enter r1:");
      int r1=sc.nextInt();
      System.out.println("Enter im1:");
      int im1=sc.nextInt();
      System.out.println("Enter r2:");
      int r2=sc.nextInt();
      System.out.println("Enter im2:");
      int im2=sc.nextInt();
      pra16 obj1=new pra16();
      obj1.add(r1,im1,r2,im2);
      obj1.sub(r1,im1,r2,im2);
      obj1.mul(r1,im1,r2,im2);

  }
}
