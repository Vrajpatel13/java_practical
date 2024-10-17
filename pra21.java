class Degree{
    void getDegree(){
        System.out.println("I got a degree");
    }
}
class Undergraduate extends Degree{
@Override
void getDegree(){
System.out.println("I am an Undergraduate");
}
}
class Postgraduate extends Degree{
    @Override
    void getDegree(){
        System.out.println("I am Postgraduate");
        }
        
}

public class pra21 {
    public static void main(String[] args) {
        Degree obj1=new Degree();
        Undergraduate obj2=new Undergraduate();
        Postgraduate obj3=new Postgraduate();
        obj1.getDegree();
        obj2.getDegree();
        obj3.getDegree();
        

    }
}
