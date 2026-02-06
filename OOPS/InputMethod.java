package OOPS;

class NumberInputWithGet{
    int first , second , third ;

    public NumberInputWithGet() {
    }

    void getnumber(int frtVal , int ScdVal , int trdVal){
        this.first = frtVal;
        this.second = ScdVal;
        this.third = trdVal ; 
    }

    void printNumbers(){
        System.out.print("First Value : " + first);
        System.out.print("Second Value : " + second);
        System.out.print("Third Value : " + third);
        System.out.println();
    }
    
}

public class InputMethod {
    public static void main(String[] args) {
        int first = 10 , second = 15 , third = 12 ;
        System.out.println();
        NumberInputWithGet getnumber = new  NumberInputWithGet();
        getnumber.getnumber(first, second, third);
        getnumber.printNumbers();
    }
}
