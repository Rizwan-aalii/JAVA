public class ControleSatt {
    
    public static void main(String[] args) {
        System.out.println("Controle Statment");

        int age = 25 ;
        if(age >= 18){
            System.out.println("Eligible for Vote");
        }
        else{
            System.out.println("Not Eligible For Vote");
        }

        for(int i= 0 ; i <= 5 ; i++){
            if(i == 2){
                continue;
            }
            else{
                System.out.print(i + " ");
            }
        }
        System.out.println();

        for(int i= 0 ; i <= 5 ; i++){
            if(i == 2){
                break;
            }
            else{
                System.out.print(i + " ");
            }
        }
        System.out.println();

    }
}
