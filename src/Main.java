import java.util.*;
import java.util.Collections;
import java.util.ArrayList;


public class Main {
    public static void main(String[] args){

        List<Cards> cardDeck = new ArrayList<Cards>();

        for(int i = 0; i<4; i++){ //suits
            for(int j =0; j<15; j++){ //ranks
                cardDeck.add(new Cards());
            }
        }

        Collections.shuffle(cardDeck, new Random());

    String [] playerDeck = new String [26];
    String [] compDeck = new String [26];
    int playerScore = 0;
    int compScore= 0;
    int playerValue = 0;
    int compValue = 0;

    for(int i =0; i <= 25; i++){
        String card1 = playerDeck[i];
        String card2 = compDeck[i];

        System.out.println("The player drew the " + card1);
        System.out.println("The computer drew the " + card2);
    }
    Collections.shuffle(cardDeck, new Random());
    }
}

