package Advance_Of_Java;
class Human{
    String name ;
    int age;
    char gender ;

    Human(String name , int age , char gender){
        this.name = name ;
        this.age = age ;
        this.gender = gender ;
    }

    void displayHumanInfo(){
        System.out.println("Human Name : " + name + " Age is : "+ age + " gender is : " + gender);
    }
}

public class ObjectLifeCycle {
    public static void main(String[] args) {

        System.out.println("Object Life Cycle");

        String name = "Rizwan" ;
        int age = 20 ;
        char gender = 'M' ;
        // object is born with new keyword
        Human manav = new Human(name , age , gender);
        // now we use object with method
        manav.displayHumanInfo();

        // unreachable when we give assign object to null
        manav = null ;

        // now java GC Garbage Collection Look on this and add in delete list

        // Finalization Before delete he gives one chance to finalize method to close all the connection and leave

        // now the manav object is deallocated from RAM


    }
}
