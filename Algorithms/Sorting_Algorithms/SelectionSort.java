package Algorithms.Sorting_Algorithms;

public class SelectionSort {
    public static void main(String[] args) {
        
    int values[] =  {12,15,11,9,14};

    for (int i = 0 ; i<values.length ; i++){
        System.out.print(values[i] + " ");
    }
        System.out.println();

    for(int i = 0 ;i<values.length -1 ;i++){
        int index  = i ;
        for (int j = i+1 ; j < values.length ; j++){
            if (values[j] < values[index]){
                index = j ;
            }
        }
            int temp = values[i] ;
            values[i] = values[index] ;
            values[index] = temp ;
    }
        for (int i = 0 ; i<values.length ; i++){
            System.out.print(values[i] + " ");
        }
        System.out.println();


    }
}
