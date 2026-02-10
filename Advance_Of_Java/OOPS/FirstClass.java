package Advance_Of_Java.OOPS;

class MyClass{
    int age ;
    String name ;

    public MyClass(int age, String name) {
        this.age = age;
        this.name = name;
    }

    void displayMyClass(){
        System.out.println("Age is : " + age + " Name is : " + name );
    }
}

public class FirstClass {
    
    public static void main(String[] args) {
        System.out.println("Class And Object");

        MyClass myclass = new  MyClass(18, "Rizwan");
        myclass.displayMyClass();
    }
}
