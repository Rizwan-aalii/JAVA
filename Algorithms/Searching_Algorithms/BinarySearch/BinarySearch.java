package Algorithms.Searching_Algorithms.BinarySearch;

public class BinarySearch {

    static int BinarySearchAlgorithm(int arr[] , int target ){
        int start = 0 , end = arr.length-1 ;
        while (start <= end ){
            int mid = (start + end ) / 2  ;

            if (arr[mid] == target){
                return mid ;
            } else if (arr[mid] < target) {
                start = mid + 1 ;
            }
            else {
                end = mid - 1 ;
            }
        }
        return  -1  ;
    }

    public static void main(String[] args) {
        int values[] =  {12,15,11,9,14};

        for (int i = 0 ; i<values.length ; i++){
            System.out.print(values[i] + " ");
        }
        System.out.println();

        for (int i = 0 ; i<values.length-1; i++) {
            int index = i ;
            for (int j = i+1 ; j < values.length ; j++){
                if (values[j] < values[index]) {
                    index = j ;
                }
            }
            int temp = values[index] ;
            values[index] = values[i] ;
            values[i] = temp ;
        }

        for (int i = 0 ; i<values.length ; i++){
            System.out.print(values[i] + " ");
        }
        System.out.println();

        int target = 14 ;
        boolean found = false ;
        int start = 0 , end = values.length ;

        int index = BinarySearchAlgorithm(values , target) ;
        if (index == -1 ){
            System.out.println("Value is Not Found : " + target);
        } else {

        System.out.println("Value Found At Index : " + index + " Val : " + target);
        }
    }
}
