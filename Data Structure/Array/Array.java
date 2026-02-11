
class StudentGrades{
    char gradesOfStd [] ;
    int attendese ;

    boolean checkSizeGreatore(){
        if(attendese >= gradesOfStd.length){
            System.out.println("Grades Are Fulled ");
            return  true ;
        }
        return  false ;
    }

    boolean checkSizeLess(){
        if(gradesOfStd.length == -1){
            System.out.println("Grades Are Empty");
            return true ;
        }
        return  false ;
    }

    public StudentGrades(int size) {
        gradesOfStd = new char[size]; 
        attendese = 0 ;
    }

    void insertStdGrades(char grade){
        if(checkSizeGreatore()) return;
        if(checkSizeLess()) return;

        gradesOfStd[attendese] = grade ;
        attendese++ ;
    }

    void displayAllGrades(){
        if(checkSizeLess()) return;

        for(int i = 0 ; i< attendese ; i++){
            System.out.print(gradesOfStd[i] + " ");
        }
        System.out.println();
    }

    



    


}

public class Array {
 
    public static void main(String[] args) {

        System.out.println("Array Crud");
        
        int size = 4 ;
        char garades = 'A';
        char fullgar = 'B';
        char midgarde = 'D';

        StudentGrades gardes = new StudentGrades(size) ;
        gardes.insertStdGrades(garades);
        gardes.insertStdGrades(fullgar);
        gardes.displayAllGrades();

    }
}
