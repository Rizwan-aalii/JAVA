
import javax.swing.plaf.TreeUI;

public class Operators {
    public static void main(String[] args) {
        System.out.println("Operator's");

        /* Artmetic Operators
        Addition - + = 2+3 
        Substraction - - 5-2 
        Multiplay - * 2*5 
        Divid - 2/10 
        Module - % 2%13 = 1 */
        int addTwoNo = 2+2 ;
        int subTwoNo = 5-3;
        int multTwoNo = 2*5 ;
        int divTwoNo = 10/2;
        int modTwoNo = 14%13 ;

        System.out.println(addTwoNo);
        System.out.println(subTwoNo);
        System.out.println(multTwoNo);
        System.out.println(divTwoNo);
        System.out.println(modTwoNo);

        /*
        Logical Operator's 
        = , < , > , || , && , != == , ===  */

        boolean checkequal = 10 == 10 ? true : false ;
        System.out.println( " == " + checkequal);

        boolean checknaga = 10 != 10 ? true : false ;
        System.out.println( " != " + checknaga);

        boolean checkgre = 10 > 10 ? true : false ;
        System.out.println( " > " + checkgre);

        boolean checkless = 10 < 10 ? true : false ;
        System.out.println( " < " + checkless);

        boolean checkqualgr = 10 <= 10 ? true : false ;
        System.out.println( " <= " + checkqualgr);

        boolean checkqualess = 10 >= 10 ? true : false ;
        System.out.println( " >= " + checkqualess);

        /* Logical case */

        if(12 == 12 && 10 == 10){
        System.out.println( " Logical AND && == " + true);
        }
        else {
            System.out.println(false);
        }

        if(12 > 12 || 10 == 10){
        System.out.println( " Logical OR || == " + true);
        }
        else {
            System.out.println(false);
        }



        /*
        bit manupalation later */







    }
}
