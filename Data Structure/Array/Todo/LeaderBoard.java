class Game{
    private int playerScoreList[] ;
    private int countEntryOfPlayer ;
    private int leadBoardPlayer[] ;
    private String playerName[] ;
    private String leadBoardPlayerName[] ;

    public Game(int size){
          playerScoreList = new int[size] ;
          countEntryOfPlayer = 0 ;
          leadBoardPlayer = new int[5];
          playerName = new String[size] ;
          leadBoardPlayerName = new String[5];


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

    void sortThePlayer() {
        if (checkSizeForLess()) return;


        for (int i = 0; i < countEntryOfPlayer - 1; i++) {
            for (int j = 0; j < countEntryOfPlayer - i - 1; j++) {
                if (playerScoreList[j] < playerScoreList[j+1]) {


                    int tempScore = playerScoreList[j];
                    playerScoreList[j] = playerScoreList[j+1];
                    playerScoreList[j+1] = tempScore;


                    String tempName = playerName[j];
                    playerName[j] = playerName[j+1];
                    playerName[j+1] = tempName;
                }
            }
        }
    }
    
    void insertLeaderBoard(){
        if (checkSizeForLess()) return;

        for (int i = 0 ; i < leadBoardPlayer.length  ;i++){
            leadBoardPlayer[i] = playerScoreList[i];
            leadBoardPlayerName[i] = playerName[i];
        }
    }



    void displayTheLeaderBoard(){
        if (checkSizeForLess()) return;

        System.out.println(" -- Display All The LeadBoard Players -- ");
        for (int i = 0 ; i< leadBoardPlayer.length ; i++){
            System.out.print(" Player Name : " + leadBoardPlayerName[i]);
            System.out.println( " Score : " + leadBoardPlayer[i]);
        }
        System.out.println();
    }

    void searchPlayerScore(String name){
        if (checkSizeForLess()) return;

        boolean fond =  false ;
        for (int i = 0 ; i<playerName.length ;i++){
            if (playerName[i] == name){
                System.out.print("Player Score : " + playerScoreList[i]);
                System.out.println(" Player Name : " + playerName[i]);
                fond = true ;
            }
        }
        if (fond != true ){
            System.out.println("Player is Not Found ");
        }
    }

    void growListOfPlayers(){
        int newsize = playerScoreList.length *2 ;
        int newScore[] = new int[newsize] ;
        String newScoreName [] = new String[newsize] ;

        for (int i = 0 ; i<playerScoreList.length ; i++){
            newScore[i] = playerScoreList[i] ;
            newScoreName[i] = playerName[i] ;
        }

        playerScoreList = newScore ;
        playerName = newScoreName ;

        System.out.println("List Has Increase ");

    }

    // Check List Of Score
    void displayListOfPlayer(){
        if (checkSizeForLess()) return;

        System.out.println(" -- Display All The Players -- ");
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
        int size = 5 ;
        Game game = new Game(size) ;
        game.insertPlayerScore(12 , "Aman");
        game.insertPlayerScore(50 , "Shanu");
        game.insertPlayerScore(11 , "Ammu");
        game.insertPlayerScore(95 , "riaazu");
        game.insertPlayerScore(30 , "amaan");
        game.growListOfPlayers();
        game.insertPlayerScore(22 , "Aliyat");
        game.displayListOfPlayer();
        game.updatePlayerScore(85 ,3);
        game.displayListOfPlayer();
        game.sortThePlayer();
        game.displayListOfPlayer();
        game.insertLeaderBoard();
        game.displayTheLeaderBoard();
        game.searchPlayerScore("Aman");

    }
}