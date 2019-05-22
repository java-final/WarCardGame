import java.util.Random;
import java.util.Collections;
import java.util.ArrayList;
import java.util.Scanner;
import java.util.LinkedList;
import java.util.List;


public class Main {
    public static void main(String[] args) {
     Scanner input = new Scanner(System.in);

     List<Deck> cardDeck = new ArrayList<Deck>(); //
     for (int i = 0; i < 4; i++) { //SUITS 0-3
      for (int j = 2; j < 15; j++) {//RANKS 2-14
       cardDeck.add(new Deck(i, j));
      }
     }
     //CALL SHUFFLE METHOD HERE... when it is made...
     LinkedList<Deck> deck1 = new LinkedList<Deck>();
     LinkedList<Deck> deck2 = new LinkedList<Deck>();

     deck1.addAll(cardDeck.subList(0, 25)); //Half of the deck is for player#1
     deck2.addAll(cardDeck.subList(26, cardDeck.size())); //Other half of the deck is for player#2

       while (true) {
        Deck player1Card = deck1.pop(); //Allows both players to place one card face up in middle
        Deck player2Card = deck2.pop();

        System.out.println("Player 1 is playing the card >>" + player1Card.toString());
        System.out.println("Player 2 is playing the card >>" + player2Card.toString());


        if (player1Card.getValueCard() > player2Card.getValueCard()) { //(If) player#1 wins this if runs
         deck1.addLast(player1Card); //The higher value card wins the two cards and places them both in deck
         deck2.addLast(player2Card);
         System.out.println("Player #1 wins this round!!");
        } else if (player2Card.getValueCard() > player1Card.getValueCard()) { //(Else if) player#2 wins this else if runs
         deck2.addLast(player2Card);
         deck1.addLast(player1Card);
         System.out.println("Player #2 wins this round!!");
         } else { //(Else) War happens; when both players cards hold the same value
          System.out.println("WAR!!");
          List<Deck> warPlayer1 = new ArrayList<Deck>();
          List<Deck> warPlayer2 = new ArrayList<Deck>();

          for(int i = 0; i < 3; i++) {
           //Making sure both players have enough cards to even start war (need at least 4)
           if(deck1.size() == 0 || deck2.size() == 0){
           }
           warPlayer1.add(deck1.pop()); //Add cards for war
           warPlayer2.add(deck2.pop());
          }
          if(warPlayer1.size() == 3 && warPlayer2.size() == 3){ //For when both players have enough cards to declare war
           System.out.println("The war card from player#1 is " + warPlayer1.get(0).toString());
           System.out.println("The war card from player#2 is " + warPlayer2.get(0).toString());
          }
          else if (warPlayer1.get(2).getValueCard() > warPlayer2.get(2).getValueCard()){
             deck1.addAll(warPlayer1);
             deck1.addAll(warPlayer2);
             System.out.println("Player#1 wins this war round!");
          }
          else if(warPlayer2.get(2).getValueCard() > warPlayer1.get(2).getValueCard()){
          deck2.addAll(warPlayer2);
          deck2.addAll(warPlayer1);
            System.out.println("Player#2 wins this war round!");
          }
        }
       if(deck1.size() == 0){
         String winner;
         System.out.println("Player#2 wins the game!");
       }
       else if(deck2.size() == 0){
         System.out.println("Player#1 wins the game!");
        }
       }

    }
}
