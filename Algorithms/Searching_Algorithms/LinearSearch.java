package Algorithms.Searching_Algorithms;

public class LinearSearch {
    public static void main(String[] args) {
        int values[] =  {12,15,11,9,14};

        for (int i = 0 ; i<values.length ; i++){
            System.out.print(values[i] + " ");
        }
        System.out.println();

        int target = 9 ;
        boolean found = false ;

        for(int i = 0 ; i<values.length-1 ; i++){
            if (target == values[i]){
                System.out.print("At Index : " +i + " Val : " + values[i]);
                found = true ;
            }
        }

        if (found != true){
            System.out.println("Target Not Found : " + target
            );
        }
    }
}
