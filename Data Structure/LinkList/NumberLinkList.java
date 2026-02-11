
class Node{
    int data ;
    Node next ;

    Node (int val ){
        this.data = val ;
        this.next = null ;
    }
}

class LinksList{

    Node head ;
    Node tail ;
    int count ;


    public LinksList() {
        this.head = null;
        this.tail = null;
        this.count = 0 ;
    }

    private boolean checkHeadNull(){
        if (head == null) {
            System.out.println("List is Empty");
            return  true ;
        }
        return  false ;
    }

    private boolean checkIndex(int index){
        if (index >= count) {
            System.out.println("Index is Invalid");
            return  true ;
        }
        return  false ;
    }

    void insertAtHead(int val){
        Node newnode = new Node(val);

         if(head == null){
            head = tail = newnode ;
            System.out.println("Insert At Head : " + newnode.data);
            count++ ;
            return;
        }

        newnode.next = head ;
        head = newnode ;
        count++ ;
        System.out.println("Insert At Head : " + newnode.data);
    }

    void insertAtTail(int val ){
        
        Node newnode = new Node(val);
        if(head == null ){
            head = tail = newnode ;
            count++ ;
            System.out.println("Insert At Head : " + newnode.data);
            return; 
        }

        tail.next = newnode ;
        tail = newnode ;
        count++ ;
        System.out.println("Insert At Tail : " + newnode.data);
    }

    void updateNode(int index , int val ){
        if(checkHeadNull()) return; 
        if(checkIndex(index)) return;
        // this counting start from 1 index 
        // loop start from 0 index that why index -1 ;
        Node temp = head ;
        for(int i = 0 ; i<index-1 ; i++){
            temp = temp.next ;
        }
        temp.data = val ;
        System.out.println("Update At Index : " + val);
    }

    void deleteNodeAtHead(){
        if(checkHeadNull()) return; 

        head = head.next ;
        if(head == null){
             tail = null ;
        }
    }

    // void deleteNode(int index){
    //     if(checkHeadNull()) return;

    //     if(index == 0){

    //     }
    // }

    void deleteNodeAtTail(){
        if(checkHeadNull()) return;

        Node temp = head ;
        while(temp.next != tail){
            temp = temp.next ;
        }
        temp.next = null ;
        tail = temp ;
    }






    void displayNodes(){
        if(checkHeadNull()) return;

        Node temp = head ;
        while(temp != null){
            System.out.print(temp.data + " -> ");
            temp = temp.next ;
        }
        System.out.println();
    }

    void sizeOfList(){
        if(checkHeadNull()) return;

        System.out.println("Size of List : " + count);
    }

    


}

public class NumberLinkList {
    public static void main(String[] args) {
        
        System.out.println("Link List CRUD");

        LinksList list = new  LinksList();
        list.insertAtHead(12);
        list.displayNodes();
        list.deleteNodeAtTail();
        
    }
}
