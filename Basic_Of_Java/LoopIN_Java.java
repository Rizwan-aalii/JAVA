

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
        
        // nasted Loop 

        for(int k = 1 ; k < 3 ; k++){
            for(int p = 1 ; p < 4 ; p++){
                System.out.print(p + " ");
            }
            System.out.println();
        }

        // Switch Case 
        int months = 1 ;
        switch(months) {
            case 1 : 
            System.out.println("January");
            break; 
            case 2 :
                System.out.println("February");
                break;
            case 3 :
                 System.out.println("March");
                 break;
            case 4 :
                System.out.println("April");
                break;
            case  5 :
                System.out.println("May");
                break;
            case 6 :
                System.out.println("June");
                break;
            case 7 :
                System.out.println("July");
                break;
            case 8 :
                System.out.println("August");
                break;
            case 9 :
                System.out.println("September");
                break;
            case  10 :
                System.out.println("October");
                break;
            case  11 :
                System.out.println("November");
                break;
            case 12 :
                System.out.println("December");
                break;
        }

    }
}
