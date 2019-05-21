import java.util.ArrayList;
import java.util.Random;

public class Deck {
ArrayList<Cards> Deck = new ArrayList <Cards> (52);
ArrayList<Cards> Shuffled = new ArrayList<Cards>(52);

public Deck (){
    String suit = " ";
    String rank = " ";
    for(int i = 0; i < 4; i++ ){
        if(i == 0){
            suit = "Hearts";
        }
        if(i == 1){
            suit = "Clubs";
        }
        if(i == 2){
            suit = "Diamonds";
        }
        if(i == 3){
            suit = "Spades";
        }
    }
    for(int j = 1; j < 13; j++) {
        if (j == 1) {
            rank = "Ace";
        }
        if (j > 0 & j < 11) {
            rank = " " + j;
        }
        if (j == 11) {
            rank = "Jack";
        }
        if (j == 12) {
            rank = "Queen";
        }
        if (j == 13) {
            rank = "King";
        }
    }
    Cards card = new Cards(suit, rank);
    Deck.add(card);
    }
    public Cards grabFromShuffledDeck(int i){
    if(!Shuffled.isEmpty()){
        return Shuffled.get(i);
    }
        return null;
    }
    public static void shuffle(){
        int random = (int) (Math.random() * 52);

    }
    public static void valueComparison(Cards cards){
    int amount;
    if(value > cards.getValue()){
        amount = 1;
    }
    else if(value < cards.getValue()){
        amount = 2;
    }
    else
        amount = 3;
    }
}
