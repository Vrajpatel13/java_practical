import java.util.*;
class members{
    String name,address;
    int age;
    long num;
    double salary;
    Scanner sc=new Scanner(System.in);
    void printSalary()
    {
        System.out.println(salary);
    }
    void getdata()
    {
        System.out.println("Enter the name:");
        name=sc.nextLine();
        System.out.println("Enter the age:");
        age=sc.nextInt();
        sc.nextLine();
        System.out.println("Enter the address:");
        address=sc.nextLine();
        System.out.println("Enter the phone number:");
        num=sc.nextLong();
        System.out.println("Enter the salary:");
        salary=sc.nextDouble();

    }
    void print()
    {
        System.out.println("Name: "+name);
        System.out.println("Age: "+age);
        System.out.println("Phone Number: "+num);
        System.out.println("Address: "+address);
        System.out.print("Salary: ");
        printSalary();

    }
}

class Employee extends members{
    String special;
    @Override
    void getdata() {
        super.getdata();
        sc.nextLine();
        System.out.println("enter the special designation for employee");
        special=sc.nextLine();
    }
    @Override
    void print()
    {
        super.print();
        System.out.println("Specialization: "+special);
    }

}

class Manager extends members{
    String department;
    @Override
    void getdata() {
        super.getdata();
        sc.nextLine();
        System.out.println("Enter the department");
        department=sc.nextLine();
    }
    @Override
    void print()
    {
        super.print();
        System.out.println("Department: "+department);
    }

}
public class pra18 {
    public static void main(String[] args) {
        Employee obj1=new Employee();
        Manager obj2=new Manager();
        obj1.getdata();
        System.out.println("      Employee         ");
        obj1.print();
        obj2.getdata();
        System.out.println("      Manager        ");
        obj2.print();

    }
}
