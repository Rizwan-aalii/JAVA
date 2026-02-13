
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

    public DoublyLinkList(){
        head = null ;
        tail = null ;
        count = 0 ;
    }

    public void insertAtHead(int val){

        Nodes newnode = new Nodes(val) ;

        if (head == null){
            head = tail = newnode ;
            System.out.println("Insert First At Head : " + val);
            return;
        }

        newnode.next = head ;
        head.prev = newnode ;
        head = newnode ;
        System.out.println("Insert At Head : " + val);
    }

    void displayList(){
        if (checkHeadForNull()) return;

        Nodes temp = head ;
        while (temp != null){
            System.out.print( " <- " + temp.data + " -> " );
            temp = temp.next ;
        }
        System.out.println();
    }

}

public class DoublyList {

    public static void main(String[] args) {

        System.out.println("CRUD on Doubly LinkList");
        DoublyLinkList list = new DoublyLinkList();
        list.insertAtHead(12);
        list.insertAtHead(10);
        list.displayList();

    }
}