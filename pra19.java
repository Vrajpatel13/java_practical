import java.util.*;
class Rectangle{
    double length,width;
    Rectangle(double length,double width)
    {
        this.length=length;
        this.width=width;
    }
    double area()
    {
        return length*width;
    }
    double perimeter()
    {
        return 2*(length+width);
    }
   
}
class Square extends Rectangle{
    Square(double s){
        super(s,s); //calling the base constructor

    }

}

public class pra19 {
    public static void main(String[] args)
    {
        System.out.print("Enter the size of the array");
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
       Rectangle arr[]=new Rectangle[n];
        System.out.println("Enter the rectangle's or square's parameters");
       for(int i=0;i<n;i++){
        System.out.println("Enter R for rectangle and S for square");
        char c=sc.next().charAt(0);
        if(c=='r' || c=='R')
        {
            System.out.println("Enter length");
            double l=sc.nextDouble();
            System.out.println("Enter breadth");
            double b=sc.nextDouble();
            arr[i]=new Rectangle(l, b);
        }
       else if(c=='s' || c=='S'){
        System.out.println("Enter the side of the square");
        double s=sc.nextDouble();
        arr[i]=new Square(s);
       }
       else{
        System.out.println("Enter correct character");
        i--;
       }
    }
       

        for(Rectangle i:arr){
        System.out.println(i.area());
        System.out.println(i.perimeter());
        }
       
    }
}
