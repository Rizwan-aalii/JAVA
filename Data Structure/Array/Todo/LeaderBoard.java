class Game{
    private int playerScoreList[] ;
    private int countEntryOfPlayer ;
    private int leadBoardPlayer[] ;
    private String playerName[] ;

    public Game(int size){
          playerScoreList = new int[size] ;
          countEntryOfPlayer = 0 ;
          leadBoardPlayer = new int[5];
          playerName = new String[size] ;

    }

    private boolean checkScore(int score){
        if (score > 100){
            System.out.println("Your Score is More Than 100 : " + score);
            return true ;
        }
        return false ;
    }

    private boolean checkSizeGreator(){
        if (countEntryOfPlayer >= playerScoreList.length ){
            System.out.println("Player Are Fulled ");
            return true ;
        }
        return  false ;
    }

    private boolean checkIndexandSize(int index){
        if (index >= playerScoreList.length){
            System.out.println("Invalid Index : " + index);
            return true ;
        }
        return false ;
    }

    private boolean checkSizeForLess(){
        if (playerScoreList.length == -1){
            System.out.println("Player List Is Empty ");
            return  true ;
        }
        return  false ;
    }


    // Enter Player's
    void insertPlayerScore(int score , String name){
        if (checkSizeGreator()) return;
        if (checkScore(score)) return;

        playerName[countEntryOfPlayer] = name ;
        playerScoreList[countEntryOfPlayer] = score ;
        countEntryOfPlayer++ ;
    }

    // Check List Of Score
    void displayListOfPlayer(){
        if (checkSizeForLess()) return;

        System.out.print("[ " );
        for (int i = 0 ; i<countEntryOfPlayer ; i++){
            System.out.print("Player Name : " + playerName[i]);
            System.out.println( " | Score : " + playerScoreList[i] + " ,");
        }
        System.out.println(" ]");

    }

    void updatePlayerScore(int score , int index){
        if (checkScore(score)) return;
        if (checkSizeForLess()) return;
        if (checkIndexandSize(index)) return;
        System.out.print("Player Name : " + playerName[index]);
        System.out.println(" | Score has Update : " + score);
        System.out.println();
        playerScoreList[index] = score ;
    }


}


class LeaderBoard{
    public static void main(String[] args) {
        System.out.println("This is Game Logic LeaderBoard ");
        int size = 4 ;
        Game game = new Game(size) ;
        game.insertPlayerScore(12 , "Aman");
        game.insertPlayerScore(14 , "Shanu");
        game.insertPlayerScore(11 , "Ammu");
        game.insertPlayerScore(95 , "riaazu");
        game.displayListOfPlayer();
        game.updatePlayerScore(50 ,3);
        game.displayListOfPlayer();

    }
}