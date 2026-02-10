public class TypeCasting {
    public static void main(String[] args) {
        System.out.println();

        // implicit and explicit

        // implicit 
        byte data1 = 10 ;
        short data2 = data1 ;
        int data3 = data2 ;
        long data4 = data3 ;
        System.out.println("Implicit Type");
        System.out.println(data1);
        System.out.println(data4);


        // explicit

        long val1 = 1000000l ;
        int val2 = (int) val1 ;
    }
}
