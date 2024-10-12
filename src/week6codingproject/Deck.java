package week6codingproject;

import java.util.Collections;
import java.util.List;
import java.util.ArrayList;

public class Deck {

  private List<Card> cards = new ArrayList<>();
  
  public Deck() {
    String[] suits = {"Hearts", "Diamonds", "Clubs", "Spades"};
    String[] number = {"Two", "Three", "Four", "Five", "Six", "Seven", "Eight", "Nine", "Ten", "Jack", "Queen", "King", "Ace"};
   for(String suit : suits) {
    for(int i = 0; i < number.length; i++) {
      int value = i + 2;
      String name = number[i] + " of " + suit;
      cards.add(new Card(value, name));
    }
   }

   }
  
 public void shuffle() {
 Collections.shuffle(cards);
  }
  
  public Card draw() {
    return cards.remove(0);
  }
  {
  
  
  
  
  
  
  
  
  
  
  
  

}
}