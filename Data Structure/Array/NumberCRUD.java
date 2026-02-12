

class ContactNumbers{
    int count ;
    long numberArray[];
    private int sizeOfContact ;

    private boolean checkSizeLess(){
        if(sizeOfContact == -1){
            System.out.println("Number Slot is Empty ");
            return true ;
        }
        return  false ;
    }

    private boolean  checkSizeGreator(){
        if(count >= sizeOfContact){
            System.out.println("Number Slot is Fulled ");
            return true ;
        }
         return  false ;
    }
    
    private boolean checkIndex(int index){
        if(index > count){
            System.out.println("Enter Valid Index");
            return true ;
        }
        return  false ;
    }
    
    private void loopONumbers(int start , int end , String work){
        if(checkSizeLess()) return;

        switch (work) {
            case "Print" :
                for(int i = start ; i<end ; i++){
                    System.out.print(numberArray[i] + " ");
                }
                System.out.println();
                break;
            case "SwapForwad" :
                for(int i = start ; i<end -1; i++){
                    numberArray[i] = numberArray[i+1];
                }
                numberArray[end-1] = -1 ;
                break;
            default:
                System.out.println("Enter Valid Work Like : Print , SwapForwad , SwapBackward");
                throw new AssertionError();
        }
    }

    private void loopONumbers(int start , int end , String work , long number){
        if(checkSizeLess()) return;

        switch (work) {
            case "Print" :
                for(int i = start ; i<end ; i++){
                    System.out.print(numberArray[i] + " ");
                }
                System.out.println();
                break;
            case "SwapForwad" :
                for(int i = start ; i<end -1; i++){
                    numberArray[i] = numberArray[i+1];
                }
                numberArray[end-1] = -1 ;
                break;
            case "Search" :
                boolean found = false ;
                for(int i = start ; i<end ; i++){
                    if(number == numberArray[i]){
                        System.out.println("Found At Index : " + i + " No. is : " + numberArray[i]);
                        found = true ;
                    }
                }
                if(found != true){
                    System.out.println("Number is Not Found ");
                }
                break;
            default:
                System.out.println("Enter Valid Work Like : Print , SwapForwad , SwapBackward");
                throw new AssertionError();
        }
    }

    public ContactNumbers(int size) {
        this.count = 0;
        this.numberArray = new long[size];
        sizeOfContact = numberArray.length ;
    }

    
    void insertNumber(long  number){
        if(checkSizeGreator()) return ; 
        if(checkSizeLess()) return; 

        System.out.println("Number Add : " + number + " At Index : " + count);
        numberArray[count] = number ;
        count++ ;
    }

    void insertAtFirst(long number){
        if(checkSizeGreator()) return;

        for(int i = sizeOfContact-1 ; i>0 ; i--){
            numberArray[i] = numberArray[i-1];
        }
        System.out.println("Number Add : " + number + " At Index : " + count);
        numberArray[0] = number ;
        count++ ;
    }

    void sizeOfArray(){
        if(checkSizeLess()) return ;

       System.out.println("Size Of Array : " + count);
    }

    void searchNumber(long number){
        if(checkSizeLess()) return; 

        loopONumbers(0, count, "Search", number);
    }

    void searchByIndex(int index){
        if (checkIndex(index)) return;

        for (int i = 0 ; i<count ; i++){
            if (i == index){
                System.out.println("Found Contact : " + numberArray[i]);
            }
        }
    }

    void updateNumber( int index , long number){
        if(checkIndex(index)) return; 

        System.out.println("Number Update : " + number + " At Index : " + index);
        numberArray[index] = number;
    }

    void deleteNumber(int index){
        if(checkIndex(index)) return; 

        System.out.println("Number Add : " + numberArray[index] + " At Index : " + index);
        loopONumbers(0, count, "SwapForwad");
        count-- ;
    }

    void displayNumbers(){
        if(checkSizeLess()) return; 

        loopONumbers(0, count, "Print");
    }

    
}

public class NumberCRUD {
    
    public static void main(String[] args) {

        System.out.println("Array Of Contact No. ");

         long rizwanNo = 8209790097l ;
         long mohdRafiq = 7410887070l ;
         long ajoysir = 8132444555l ;
         long myrizwan = 9928560225l;
         long mohdRafique = 8890233014l ;
         int sizeOfConstactNo_Array = 3 ;

         ContactNumbers contact = new ContactNumbers(sizeOfConstactNo_Array);
         contact.insertNumber(rizwanNo);
         contact.insertAtFirst(mohdRafique);
         contact.insertNumber(mohdRafiq);
         contact.displayNumbers();
         contact.updateNumber(1, ajoysir);
         contact.displayNumbers();
         contact.deleteNumber(0);
         contact.displayNumbers();
         contact.insertNumber(rizwanNo);
         contact.displayNumbers();
         contact.searchNumber(ajoysir);
         contact.searchByIndex(1);
         contact.sizeOfArray();
    }
}
