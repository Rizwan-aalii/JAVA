public class DataTypesin {

    public static void main(String[] args) {
        System.out.println("Data Types \n");

        /* Integer Data Type Store numbers like 0 -1 1 5 -10 100 three type of integer we look 
        int - size is 4 byte
        short - size is 2 byte 
        long - size is 8 byte */

        int age = 18 ;
        short digit = 100 ;
        long bigDigit = 100000; 

        System.out.println( age);
        System.out.println( "Size of Int : " + Integer.BYTES);
        System.out.println( "Size of Short : " + Short.BYTES);
        System.out.println( "Size of Long : " + Long.BYTES);
        System.out.println(digit);
        System.out.println(bigDigit);

        /* Float are use to store decimal values like 1.0 100.00 3.5 95.5
        float - 4 byte 
        double - 8 byte  */

        float myFloat = 12.3f;
        double price = 1200.00;

        System.out.println(myFloat);
        System.out.println(price);
        System.out.println( "Size of Float : " +Float.BYTES);
        System.out.println("Size of Double : " + Double.BYTES);

        /* character is data Type store the character like A , a G S d z 
        char - size 2 byte */

        char letter = 'a';
        System.out.println(letter);
        System.out.println("Size of Character : " + Character.BYTES);

    }
    
}
