import java.util.*;
import java.util.Collections;
import java.util.ArrayList;
import java.util.Scanner;


public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);


 String player1 = " ";
 String player2 = " ";
 String option;
 String winnerOfRound;
 String winnerOfGame;
 int value;
 int play = 1;
 boolean winner = false;


 while(play != 0){
  winner = false;
  Deck deck = new Deck();
  deck.shuffle();

  System.out.println("Welcome to the game War!!");
  System.out.println("Enter name for player 1 >> ");
  player1 = input.nextLine();
  System.out.println("Enter name for player 2 >> ");
  player2 = input.nextLine();
  System.out.println(player1 + "  # of Cards Player 1  " + player2 + "  # of Cards Player 2  ");
 }
     ArrayList<Cards> Deck1 = new ArrayList<Cards>(52);
     ArrayList<Cards> Deck2 = new ArrayList<Cards>(52);
     divideDeck(Deck1, Deck2, );
 while(winner == false){
  System.out.print(Deck1.get(0)) + "  " + (Deck1.size()) + "  " +  (Deck2.get(0)) + "  " + (Deck2.size());
  //Gets first card of player 1 & 2 and the remaining amount of cards in their deck
int i = Deck1.get(0).valueComparison(Deck2.get(0));
if(i == 1){
 Deck1.add(Deck2.add(0));
 Deck1.add(Deck1.add(0));
 Deck1.remove(0);
 Deck2.remove(0);
 winnerOfRound = player1;
}
else if(i == 2){
 Deck2.add(Deck1.add(0));
 Deck2.add(Deck2.add(0));
 Deck2.remove(0);
 Deck2.remove(0);
 winnerOfRound = player2;
}
if(i == 3){ // WAR
 winnerOfRound = "WAR";
}
 }
    }
 public static void divideDeck(ArrayList<Cards> Deck1, ArrayList<Cards> Deck2, Deck deck ){
for(int i = 0; i < 26; i++){ //26 for even divide of initial 52 cards
 Deck1.add(deck.grabFromShuffledDeck(i));
 Deck2.add(deck.grabFromShuffledDeck(i));
}
    }
}

