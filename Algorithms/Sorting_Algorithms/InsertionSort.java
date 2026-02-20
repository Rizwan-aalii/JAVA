package Algorithms.Sorting_Algorithms;

public class InsertionSort {
    public static void main(String[] args) {

        int values[] =  {12,15,11,9,14};

        for (int i = 0 ; i<values.length ; i++){
            System.out.print(values[i] + " ");
        }
        System.out.println();

        for (int i = 1 ; i<values.length ; i++){
            int key = values[i] ;
            int j = i-1 ;
            while ( j >=0 && values[j] > key ) {
                values [j+1] = values[j] ;
                j-- ;
            }
            values[j+1] = key ;
        }
        for (int i = 0 ; i<values.length ; i++){
            System.out.print(values[i] + " ");
        }
        System.out.println();









    }
}
