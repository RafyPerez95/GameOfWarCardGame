The game of war is great 2 player card game where a deck of cards is split in half and players will place 
a card from the deck on to field and the highest card wins the round.

Key Code:

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

  Technologies used in this project:
  * Java
  * Eclipse

Favorite Features:
* This code showcases the realism of the game of war mimicking a real deck of cards from its numbers and suits.

public Deck() {
    String[] suits = {"Hearts", "Diamonds", "Clubs", "Spades"};
    String[] number = {"Two", "Three", "Four", "Five", "Six", "Seven", "Eight", "Nine", "Ten", "Jack", "Queen", "King", "Ace"};
   for(String suit : suits) {
    for(int i = 0; i < number.length; i++) {
      int value = i + 2;
      String name = number[i] + " of " + suit;
      cards.add(new Card(value, name));
    }

  * This code showcases different scenarios of the game of war. For example Both players scores as well as the outcomes
  of each round even giving and option of a draw!

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

Installation and usage:
Clone my project - https://github.com/RafyPerez95/GameOfWarCardGame.git

Project Directory: 
cd - week6codingproject

Contributions:
* Anyone can contribute to this project!

Contact Info:
* Email: Rafantperez1@gmail.com
* Project Link: https://github.com/RafyPerez95/GameOfWarCardGame.git

    
