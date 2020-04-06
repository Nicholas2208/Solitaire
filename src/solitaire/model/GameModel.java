package solitaire.model;

import java.util.Stack;

import solitaire.card.Card;
import solitaire.card.Deck;
import solitaire.move.DeckMove;
import solitaire.move.Move;

public class GameModel {
	
	private static final GameModel INSTANCE = new GameModel();
	private Deck deck = new Deck();
	private Stack<Card> waste;
	
	public static GameModel getInstance() {
		return INSTANCE;
	}
	
	public Move getDeckMove() {
		return new DeckMove(getInstance());
	}
	
	public void reset() {
		deck.reset();
		waste = new Stack<Card>();
	}
	
	public boolean discard() {
		if(!this.deck.isEmpty()) {
			Card c = this.deck.draw();
			System.out.println(c);
			waste.add(c);
			return true;
		}
		
		return false;
	}
	
	
	
	
	
	
	

}
