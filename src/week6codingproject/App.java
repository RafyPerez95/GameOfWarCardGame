package week6codingproject;

public class App {

  public static void main(String[] args) {
    // TODO Auto-generated method stub

Deck deck = new Deck();
Player player1 = new Player("Player One");
Player player2 = new Player("Player Two");

// Shuffle the cards before the war begins!
deck.shuffle();

// Both players will draw 26 cards.
for(int i = 0; i < 26; i++) {
  player1.draw(deck);
  player2.draw(deck);
}

// There will be a total of 26 rounds played.
for(int i = 0; i < 26; i++) {
  Card player1card = player1.flip();
  Card player2card = player2.flip();

// If a player were to run out of cards.
  if(player1card == null || player2card == null) {
    System.out.println("One of the players ran out of cards");

  }
  
  System.out.println("Round " + (i + 1) + ":");
  System.out.print("Player 1 has ");
  player1card.describe();
  System.out.print("Player 2 has ");
  player2card.describe();
  
  if(player1card.getValue() > player2card.getValue()) {
    player1.incrementScore();
    System.out.println("Player 1 took that round!");
  } else if (player2card.getValue() > player1card.getValue()) {
    player2.incrementScore();
    System.out.println("Player 2 took that round!");
  } else {
    System.out.println("Stalemate!");
  }
  System.out.println();
}
    
// Results of Final Scores.
System.out.println("\nFinal Scores:");
System.out.println("Player 1: " + player1.getScore());
System.out.println("Player 2: " + player2.getScore());

if(player1.getScore() > player2.getScore()) {
  System.out.println("PLAYER 1 IS VICTORIOUS!");
} else if(player2.getScore() > player1.getScore()) {
  System.out.println("PLAYER 2 IS VICTORIOUS!");
} else {
  System.out.println("THE MATCH HAS ENDED IN A DRAW!");
}
    
    
    
    
    
    
    
    
    
    
    
  }

}
