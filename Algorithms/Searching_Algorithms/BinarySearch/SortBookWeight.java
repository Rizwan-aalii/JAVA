package Algorithms.Searching_Algorithms.BinarySearch;

class StackList{
    int size ;
    int count  ;
    double weight[] ;
    String books[] ;
    int top ;

    private boolean checkBooksNull(){
        if (size == -1){
            System.out.println("Book Stack is Empty ");
            return true ;
        }
        return false ;
    }

    private boolean checkIndex(int index){
        if (index > count){
            System.out.println("Book Index is Out Of Bound ");
            return  true ;
        }
        return  false ;
    }

    private boolean checkBookOverFlow(){
        if (count >= size){
            System.out.println("Book Stack is OverFlow \n");
            return  true ;
        }
        return  false ;
    }

    StackList (int capacity){
        this.size = capacity ;
        books = new String[size];
        weight = new double[size] ;
        count = 0 ;
        top = -1 ;
    }

    void push(double kg , String book ){
        if (checkBookOverFlow()) return;

        System.out.println("\nPush");
        System.out.println("Book Name : " + book + " , Weight : " + kg + " kg");

        weight[++top] = kg ;
        books[top] = book ;
        count++ ;
    }

    void pop(){
        if (checkBooksNull()) return;

        System.out.println("\nPop");
        System.out.println("Delete Book : " + books[top] + " Weight : " + weight[top]+ " kg");
        top-- ;
        count-- ;
    }

    void peek(){
        if (checkBooksNull()) return;
        System.out.println("\nPeek");
        System.out.print("Book Name : " + books[top]);
        System.out.print(" , Book Weight : " + weight[top] +" kg");
        System.out.println();
    }

    void displayBookAndWeight(){
        if (checkBooksNull()) return;

        System.out.println("\nDisPlay All The Books");

        for (int i = 0 ; i < count ; i++){
            System.out.print("Book : " + books[i]);
            System.out.print(" , Weight : " + weight[i]+" kg");
            System.out.println();
        }
    }

    void SelectionSort(){
        if(checkBooksNull()) return;

        for (int i = 0 ; i<count-1 ; i++){
            int minindex = i ;
            for (int j = i+1 ; j<count ; j++){
                if (weight[j] < weight[minindex]){
                    minindex = j ;
                }

            }
            double temp = weight[i] ;
            weight[i] = weight[minindex];
            weight[minindex] = temp ;

            String val = books[i] ;
            books[i] = books[minindex];
            books[minindex] = val;
        }
    }


    int BinarySearch(double kg){
        if (checkBooksNull()) return -1;

        System.out.println("Binary Search \n");

        int start = 0 , end = count ;
        while (start <= end){
            int mid = (start + end ) / 2 ;

            if (weight[mid] == kg){
                return mid ;
            } else if (weight[mid] < kg) {
                start = mid +1 ;
            } else {
                end = mid -1;
            }
        }
            return -1 ;
    }

}


public class SortBookWeight {
    public static void main(String[] args) {
        StackList list = new StackList(5);
        list.push(1.00 , "Java");
        list.push(2.2 , "DSA");
        list.push(1.5 , "C++");
        list.displayBookAndWeight();
        list.peek();
        list.SelectionSort();
        list.BinarySearch(2.2);
        list.displayBookAndWeight();
    }
}
