package week6codingproject;

import java.util.List;
import java.util.ArrayList;

public class Player {

 private List<Card>  hand = new ArrayList<>();
 private int score = 0;
 private String name;
 
 public Player(String name) {
   this.name = name;
 }
  
public void describe() {
  System.out.println("Player: " + name);
  for(Card card : hand) {
    card.describe();
  }
}

public Card flip() {
  if(!hand.isEmpty()) {
  return hand.remove(0);
} else {
  return null;
}
}

public void draw(Deck deck) {
  hand.add(deck.draw());
}

public void incrementScore() {
  score++;
}

public int getScore() {
  return score;
}
  
  
  
  
  
}
