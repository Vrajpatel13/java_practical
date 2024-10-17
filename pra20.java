class Shape{
    void print(){
        System.out.println("This is This is shape");
    }
}

class Rectangle extends Shape{
    void display(){
        System.out.println("This is rectangular shape");
    }
}
class Circle extends Shape{
    void putdata(){
        System.out.println("This is circular shape");
    }
}

class Square extends Rectangle{
    void sprint(){
        System.out.println("Square is a rectangle");
    }
}
public class pra20 {
    public static void main(String[] args) {
        Square obj=new Square();
        obj.print();
        obj.display();
    }
}
