public class Cards {

    public Cards(){
         String [] suit = {"Spades", "Hearts", "Diamonds", "Clubs"}; //the four card suits
         String value;
         String [] rank = {"2","3","4","5","6","7","8","9","10","Jack","Queen","King","Ace"};
         //gives the cards their numbers
        String random = String.valueOf((int) (Math.random() * 52)); //randomizes the cards

         for(int i = 0; i<rank.length; i++){
             if(rank[i] == random) {
                 value = rank[i];
             }
         }
    }
}
