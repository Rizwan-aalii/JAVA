
class Nodes {
     int data ;
     Nodes prev ;
     Nodes next ;

    Nodes(int val){
        data = val ;
        prev = null ;
        next = null ;
    }
}

class DoublyLinkList{
    private Nodes head ;
    private Nodes tail ;
    private int count ;

    private Boolean checkHeadForNull(){
        if (head == null){
            System.out.println("List is Empty ");
            return true ;
        }
        return false;
    }

    private boolean checkSizeOfIndex(){
        if (count <= 0){
            System.out.println("List is Empty : "+ count);
            return  true ;
        }
        return  false ;
    }

    private boolean checkIndex(int index){
        if (index > count){
            System.out.println("Index is Invalid : " + index);
            return true ;
        }
        return  false ;
    }

    private boolean insertAtNullHead(int val ){
        Nodes newnode = new Nodes(val);
        if (head == null){
            head = tail = newnode ;
            System.out.println("Insert First At Head : " + val);
            count++ ;
            return  true ;
        }
        return  false ;
    }

    public DoublyLinkList(){
        head = null ;
        tail = null ;
        count = 0 ;
    }

     void insertAtHead(int val){
        if (insertAtNullHead(val)) return;

        Nodes newnode = new Nodes(val) ;
        newnode.next = head ;
        head.prev = newnode ;
        head = newnode ;
        count++ ;
        System.out.println("Insert At Head : " + val);
    }

     void insertAtTail(int val){
        if(insertAtNullHead(val)) return;

        Nodes newnode = new Nodes(val) ;
        tail.next = newnode ;
        newnode.prev = tail ;
        tail = newnode ;
        count++ ;
        System.out.println("Insert First At Head : " + val);
    }

    void insertAtIndex(int index , int val){
        if (insertAtNullHead(val)) return;

        if (index == 0){
            insertAtHead(val);
            return;
        }

        Nodes newnode = new Nodes(val) ;
        Nodes temp = head ;
        for (int i = 0 ; i<index -1; i++){
            temp = temp.next ;
        }
        if (temp == tail){
            insertAtTail(val);
            return;
        }
        System.out.println("Insert At Index : " + newnode.data);
        newnode.next = temp.next ;
        newnode.prev = temp ;
        temp.next.prev = newnode ;
        temp.next = newnode ;
        count++ ;

    }

    void deleteAtHead(){
        if (checkHeadForNull()) return;

        System.out.println("Delete At Head : " + head.data);
        head.next.prev = null ;
        head = head.next ;
        if (head == null){
            head = tail = null ;
        }
        count-- ;
    }

    void deleteAtTail(){
        if (checkHeadForNull()) return;

        System.out.println("Delete At Tail : " + tail.data);
        tail = tail.prev ;
        tail.next = null ;
        if (tail == null){
            head = tail = null ;
        }

        count-- ;
    }

    void deleteAtIndex(int index){
        if (checkHeadForNull()) return;
        if (checkIndex(index)) return;

        if (index == 0){
            deleteAtHead();
            return;
        }

        Nodes temp = head ;
        for (int i = 0 ; i<index-1 ; i++){
            temp = temp.next ;
        }
        if (temp == tail){
            deleteAtTail();
            return;
        }
        temp.next.prev = temp.prev ;
        temp.prev.next = temp.next ;
        count-- ;


    }

    void updateAtIndex(int index , int val ){
        if (checkHeadForNull()) return;
        if (checkIndex(index)) return;

        Nodes temp = head ;
        for (int i = 0 ; i< index-1 ; i++){
            temp = temp.next ;
        }
        System.out.println("Update Val : " + temp.data + " To Data : " + val);
        temp.data = val ;
    }

    void displayListOrder(){
        if (checkHeadForNull()) return;

        Nodes temp = head ;
        while (temp != null){
            System.out.print( " <- " + temp.data + " -> " );
            temp = temp.next ;
        }
        System.out.println();
    }

    void sizeOfList(){
        if (checkSizeOfIndex()) return;

        System.out.println("Size Of List : " + count);
    }

    public void reverseList() {
        if (checkHeadForNull()) return;
        Nodes current = head;
        Nodes temp = null;

        // Har node ke pointers ko swap karo
        while (current != null) {
            temp = current.prev;       // Pichle node ka backup
            current.prev = current.next; // Prev ko Next bana diya
            current.next = temp;         // Next ko Prev bana diya

            current = current.prev;      // Pointers swap ho gaye hain, isliye prev hi agla node hai
        }

        // Aakhri mein Head aur Tail ko sahi jagah set karo
        if (temp != null) {
            tail = head;
            head = temp.prev; // Temp.prev ab naya head hai
        }
    }

    void displayListInReverseOrder(){
        // now game change you can also visit tail to head node's
        if (checkHeadForNull()) return;

        Nodes temps = tail ;
        while (temps != null){
            System.out.print(" <- " + temps.data + " -> ");
            temps = temps.prev ;
        }
        System.out.println();
    }


}

public class DoublyList {

    public static void main(String[] args) {

        System.out.println("CRUD on Doubly LinkList");
        DoublyLinkList list = new DoublyLinkList();
        list.insertAtHead(12);
        list.insertAtTail(25);
        list.insertAtHead(13);
        list.insertAtTail(20);
        list.displayListOrder();
//        list.deleteAtIndex(3);
        list.reverseList();
        list.displayListOrder();
        System.out.println("Reverse Order");
        list.displayListInReverseOrder();



    }
}