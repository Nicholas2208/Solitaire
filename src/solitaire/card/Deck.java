package solitaire.card;

import java.util.Stack;

public class Deck {
	
	private Stack<Card> cards = new Stack<>();
	
	public void reset() {
		this.cards.clear();
		for(Suit suit : Suit.values()) {
			for(Rank rank : Rank.values()) {
				cards.push(Card.getCard(rank, suit));
			}
		}
	}
	
	public boolean isEmpty() {
		return this.cards.isEmpty();
	}
	
	public Card draw() {
		assert !isEmpty();
		return this.cards.pop();
	}
	
	

}
