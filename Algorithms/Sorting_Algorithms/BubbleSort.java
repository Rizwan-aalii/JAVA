public class BubbleSort {
    public static void main(String[] args) {

        int value [] = {12,15,11,9,14};
        // Bubble Sort

        for (int i = 0 ; i<value.length ; i++){
            System.out.print(value[i] + " ");
        }
        System.out.println();
        // first loop start with i= 0 to size -1 this is basically how many element are
        for (int i = 0 ; i<value.length-1 ;i++){
            // this is inner loop this check all the j element with j+1 this is swap of each
            for (int j = 0 ; j<value.length-1-i ; j++){
                if (value[j] > value[j+1]){
                    int temp = value[j] ;
                    value[j] = value[j+1];
                    value[j+1] = temp ;
                }
            }
        }

        for (int i = 0 ; i<value.length ; i++){
            System.out.print(value[i] + " ");
        }
        System.out.println();

    }
}