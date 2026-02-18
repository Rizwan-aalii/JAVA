
class NOd {
    int data ;
    NOd next ;

    NOd(int val){
        this.data = val ;
        next = null ;
    }
}

 class CirCularList{

     NOd head ;
     NOd tail ;
     int count ;

     CirCularList(){
         head = null ;
         tail = null ;
     }

     private Boolean checkHeadNull(){
         if (head == null){
             System.out.println("List is Empty");
             return  true ;
         }
         return  false ;
     }

     private boolean checkHeadInsert(int val ){
         if (head == null){
             NOd newnode = new NOd(val) ;
             head = tail = newnode ;
             tail.next = head ;
             count++ ;
             System.out.println("First Insertion : " + val );
             return true ;
         }
         return false ;
     }

     private  boolean checkIndex(int index){
         if (index >= count){
             System.out.println("Invalid Index : "+ index);
             return true ;
         }
         return  false ;
     }

     void insertAtHead(int val){
         if (checkHeadInsert(val)) return;

         NOd newnode = new NOd(val) ;
         newnode.next = head ;
         head = newnode ;
         tail.next = head ;
         count++ ;
     }

     void insertAtTail(int val){
         if(checkHeadInsert(val)) return;

         NOd newnode = new NOd(val);
         tail.next = newnode ;
         tail = newnode;
         tail.next = head ;
         count++ ;
     }

     void deleteAtHead(){
         if (checkHeadNull()) return;

         System.out.println("Delete Index : " + head.data);
         head = head.next ;
         count-- ;
         if (head == null){
             head = tail = null ;
             return;
         }
         tail.next = head ;

     }

     void displayList(){
         if (checkHeadNull()) return;

         NOd temp = head ;

         do {
             System.out.print(temp.data + " -> ");
             temp = temp.next ;
         }
         while (temp != head );
     }

 }

public class SinglyList{
    public static void main(String[] args) {

        CirCularList circle = new CirCularList();
        circle.insertAtHead(12);
        circle.deleteAtHead();
//        circle.insertAtHead(14);
//        circle.insertAtHead(16);
//        circle.insertAtTail(44);
//        circle.insertAtTail(55);
//        circle.insertAtTail(60);
        circle.displayList();
    }
}
