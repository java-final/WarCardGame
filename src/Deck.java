import java.util.ArrayList;
import java.util.List;
import java.util.LinkedList;

public class Deck {
    int suit; //Suits = diamonds, clubs, hearts, & spades
    int rank; //Ranks = King, Queen, 5, 8, etc.

    public Deck(int suit, int rank) {
        this.suit = suit;
        this.rank = rank;
    }

    public int getValueCard() {

        return rank;
    }

    public void setValueCard(int rank) {
        this.rank = rank;
    }

    public String toString() {
        StringBuilder displayCardType = new StringBuilder();
        switch (rank) {
            case 11:
                displayCardType.append("Jack of ");
                break;
            case 12:
                displayCardType.append("Queen of ");
                break;
            case 13:
                displayCardType.append("King of ");
                break;
            case 14:
                displayCardType.append("Ace of ");
                break;
            default:
                displayCardType.append(rank);
                break;
        }
        switch(suit){
            case 0:
                displayCardType.append(" Clubs");
                break;
            case 1:
                displayCardType.append(" Diamonds");
                break;
            case 2:
                displayCardType.append(" Hearts");
                break;
            case 3:
                displayCardType.append(" Spades");
                break;
            default:
                System.out.println(" Nothing...");
                break;
        }
        return displayCardType.toString();
    }

}
