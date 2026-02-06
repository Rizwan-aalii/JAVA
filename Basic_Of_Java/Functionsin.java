public class Functionsin {

    static  void printName(String name){
        System.out.println( "Name is " + name);
    }

    static void sumOfTwoNo(int num1 , int num2){
        int sum = num1 + num2 ;
        System.out.println("Sum Of Two NO : " + sum);
    }
 /* this is method overload it all concept of oops */
    static double  sumOfTwoNo(double  num1 , double  num2){
        double sum = num1 + num2 ;
        return  sum ;
    }

    static String returVal(){
        return  "Enter value first : this is return not directly print ";
    }


    static void printVal(){
        System.out.println("Enter First : this is print string ");
    }
    public static void main(String[] args) {
        System.out.println("Functions");
        
        String name = "Rizwan";
        printName(name);
        // one more thing if i want to use function in main function in same class
        // i need to make that function also static beacuse is rule in oops programming more will see  ..........
        sumOfTwoNo(2, 5);
        String value =  returVal();
        System.out.println(value);
        printVal();
    }


}
