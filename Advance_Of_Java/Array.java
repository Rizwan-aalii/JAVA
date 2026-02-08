package Advance_Of_Java;

public class Array {
    public static void main(String[] args) {
        
        System.out.println("Array's");

        int array[] =  new int[3];
        array[0] = 12 ;
        array[1] = 10 ;
        array[2] = 31 ;

        for(int i=0 ; i<array.length ; i++){
            System.out.print(array[i] + " ");
        }
        System.out.println( );
    }
    
}
