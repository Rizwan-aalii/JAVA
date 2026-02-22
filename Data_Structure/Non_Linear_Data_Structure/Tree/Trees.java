package Data_Structure.Non_Linear_Data_Structure.Tree;

class Nodie{
    int data ;
    Nodie left ;
    Nodie right ;

    Nodie(int val){
        this.data = val ;
        left = null ;
        right = null ;
    }
}

class Trees {}

class Tree {
    public static void main(String[] args) {
    Nodie newnode = new Nodie(12) ;
    newnode.left = new Nodie(15);
    newnode.right = new Nodie(11);

    /*
         1
        / \
      15   11
     */
    }
}