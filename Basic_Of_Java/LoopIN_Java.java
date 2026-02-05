
import java.util.concurrent.CountDownLatch;

public class LoopIN_Java {
    public static void main(String[] args) {
        System.out.println("Loops In Java");
        
        for(int i = 0 ; i< 5 ; i++){
            System.out.print("Loop " + i + " ");
        }
        System.out.println();

        int first = 0 , last = 5 ;
        while(first < last){
            System.out.print("First Val : " + first + " Last Val : " + last + " ");
            first++ ;
            last -- ;
        }
        System.out.println();


        int i = 1;
         while(i <= 5 ){
            System.out.print("First Val : " + i + " ");
            i++ ;
        }
        System.out.println();

        int j = 6;
        do { 
            System.out.println(j);
            j++;
        } while (j<6);
        
    }
}
