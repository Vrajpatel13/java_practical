class parent{
    void base()
    {
        System.out.println("This is parent class");
    }
}
class child extends parent{
    void derived()
    {
        System.out.println("This is child class");
    
    }
}
public class pra17 {
    public static void main(String[] args) {
        parent obj1=new parent();
        child obj2=new child();
        obj1.base();
    }
}
