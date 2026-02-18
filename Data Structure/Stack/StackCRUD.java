
class Stacks{
    int size ;
    int arr[] ;
    int top ;
    int count ;

    private boolean checkStackOverFlow(){
        if (top >= size){
            System.out.println("Stack is OverFlow");
            return true ;
        }
        return false ;
    }

    private boolean checkStackEmpty(){
        if (top == -1){
            System.out.println("Stack is Empty");
            return true ;
        }
        return  false ;
    }

    Stacks(int size ){
        this.size = size ;
        arr = new int[size] ;
        top = -1 ;
        count = 0 ;
    }

    void push(int val){
        if (checkStackOverFlow()) return;

        System.out.println("Inserted Element is : " + val );
        top++ ;
        count++ ;
        arr[top] = val ;
    }

    void update(int val ){
        if (checkStackEmpty()) return;

        System.out.println("Update Val : " + val + " At Index : " +  top);
        arr[top] = val ;
    }

    void stackSize(){
        if (checkStackEmpty()) return;

        System.out.println("Current Stack Size is : " + count);
    }

    void pop(){
        if (checkStackEmpty()) return;

        System.out.println("Pop Element : " + arr[top]);
        top-- ;
        count-- ;
    }

    void peek(){
        if (checkStackEmpty()) return;

        System.out.println("Peek : " + arr[top]);
    }


}

public class StackCRUD {
    public static void main(String[] args) {

        Stacks stack = new Stacks(5);
        stack.push(12);
        stack.push(14);
        stack.update(15);
        stack.peek();
        stack.push(13);
        stack.update(21);
        stack.pop();
        stack.peek();
        stack.stackSize();

    }
}