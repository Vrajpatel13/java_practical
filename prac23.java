import java.util.Scanner;

interface Shape {
    String getColor();
    default double getArea() {
        return 0;
    }
}

class Circle implements Shape {
    private double radius;
    private String color;

    public Circle(double rad, String col) {
        radius = rad;
        color = col;
    }

    @Override
    public String getColor() {
        return this.color;
    }

    @Override
    public double getArea() {
        return (3.14 * radius * radius);
    }
}

class Rectangle implements Shape {
    private double length;
    private double width;
    private String color;

    public Rectangle(double len, double wid, String col) {
        length = len;
        width = wid;
        color = col;
    }

    @Override
    public String getColor() {
        return this.color;
    }

    @Override
    public double getArea() {
        return length * width;
    }
}

class Sign {
    private Shape backgroundShape;
    private String text;

    public Sign(Shape BShape, String tex) {
        backgroundShape = BShape;
        text = tex;
    }

    public void displaySign() {
        System.out.println("Sign:");
        System.out.println("Background Shape Color: " + backgroundShape.getColor());
        System.out.println("Background Shape Area: " + backgroundShape.getArea());
        System.out.println("Text: " + text);
    }
}

public class prac23 {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter radius of circle :");
        int x =sc.nextInt();
        sc.nextLine();
        System.out.print("Enter color of circle :");
        String y = sc.nextLine();
        Circle circle = new Circle(x, y);

        System.out.print("Enter length:");
        int a =sc.nextInt();
        System.out.print("Enter width:");
        int b =sc.nextInt();
        sc.nextLine();
        System.out.print("Enter color:");
        String c =sc.nextLine();
        Rectangle rectangle = new Rectangle(a,b,c);

        Sign circleSign = new Sign(circle, "Welcome to the Campus!");
        Sign rectangleSign = new Sign(rectangle, "Library ->");

        // Display the signs
        circleSign.displaySign();
        rectangleSign.displaySign();
    }
}
