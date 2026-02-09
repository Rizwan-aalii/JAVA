
import java.util.ArrayList;


public class Arraylist {
    public static void main(String[] args) {
        System.out.println("ArrayList ");
        
       ArrayList<Integer> array = new ArrayList<>();
       array.addFirst(12);
       array.add(15);
       array.addLast(14);
       System.out.println(array);
       array.set(1, 11);
       System.out.println(array.get(2));
       System.out.println(array);
    }
}
