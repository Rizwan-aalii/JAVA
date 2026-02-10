package Advance_Of_Java;

public class StaticandDynamic {
    public static void main(String[] args) {
        System.out.println("Dynamic Allocation");
        // in java array alloction in memory are 
        // dynamic as like object this object have two 
        // things length of array and elemnt 

    /*int arr[] this variable run at compile time 
     new int [size] this wil exicute at runtime yani memory jab 
     de jaye gee jab ye line pe code pauchegha  */

     int arr[] = new int[4];
     arr[0] = 12 ;
     arr[1] = 24 ;
     arr[2] = 36 ;

     System.out.println("Index Of array : " + arr[0]);
     System.out.println("Index Of array : " + arr[1]);
     System.out.println("Index Of array : " + arr[2]);

     // why we can increase the size of array 
     /* if we look in prev comment will have ans 
     becuase when java create array as object he contain two things
     in heap acutal array element's and length size of array 
     when we increase size object the length of array that why 
     we show the error index out of index  */





    }
}
