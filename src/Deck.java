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
            case 1:
                displayCardType.append("2 of ");
                break;
            case 2:
                displayCardType.append("3 of ");
                break;
            case 3:
                displayCardType.append("4 of ");
                break;
            case 4:
                displayCardType.append("5 of ");
                break;
            case 5:
                displayCardType.append("6 of ");
                break;
            case 6:
                displayCardType.append("7 of ");
                break;
            case 7:
                displayCardType.append("8 of ");
                break;
            case 8:
                displayCardType.append("9 of ");
                break;
            case 9:
                displayCardType.append("10 of ");
                break;
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
public static void displayWar(){
        System.out.println("-----------------------War-----------------------");
}
public static void displayEndWar(){
        System.out.println("---------------------End War---------------------");
}
        public static void populateDeck(ArrayList<String>cards){
            String stringClubs = " of clubs";
            String[] stringCardType = {" of clubs", " of spades", " of hearts", " of diamonds"};
            cards.set(0, "Gone");
            for(int i=0; i < 53; i++){
               if(i < 14 && i>0){
                   cards.set(i, stringCardType[0]);
               }
               else if(i <= 14 && i > 27){
                   cards.set(i, stringCardType[1]);
               }
               else if(i <= 27 && i > 41){
                   cards.set(i, stringCardType[2]);
               }
               else
                   cards.set(i, stringCardType[3]);
                }
            }
        public static void removeCardClubs(ArrayList<String>clubs, int random){
        clubs.set(random,"Gone");
    }
}
