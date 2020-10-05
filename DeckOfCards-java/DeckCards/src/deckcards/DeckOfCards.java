package deckcards;

import java.util.Random;
import java.util.Arrays;

public class DeckOfCards {
	int[] cards; //storage for the deck of cards
	int size;	//the current number of available cards
	Random r;	//a random number generator for dealing
	
	/*
	 * Construct and initialize the deck of cards
	 */
	DeckOfCards(){
		cards = new int[52];
		for (int i = 0; i < cards.length; i++) 
			cards[i] = i;
		shuffle();
		r = new Random();		
	}
	/**
	 * Shuffle the deck(by reseting the available card count).
	 */
	void shuffle() {
		size=52;
	}
	/**
	 * Draw a card from the deck.
	 */
	int draw() {
		int i = r.nextInt(size);
		int card = cards[i];
		
		//swap the card drawn with the last available card
		cards[i] = cards[size-1];
		cards[size-1] = card;
		size--;
		
		return card;
	}
	/**
	 * static String cardToSuit(int card) {
	 */
	
	int[] drawHand(int size) {
		int[] hand = new int[size];
		for (int i=0; i < size; i++) 
			hand[i] = draw();
		return hand;
 	}

    /**
     * Computes the suit of an integer card number.
     * 
     * @param card the card number (0-51).
     * @return the suit of the card from "HSDC".
     */
	static String cardToSuit(int card) {
		return Character.toString("HSDC".charAt(card / 13));
	}
	  /**
     * Computes the value (A-K) of an integer card number.
     * 
     * @param card the card number (0-51).
     * @return the value of the card from "A23456789TJQK".
     */
    static String cardToValue(int card) {
        return Character.toString("A23456789TJQK".charAt(card % 13));
    }
    static String cardToName(int card) {
        return cardToValue(card) + cardToSuit(card);
    }
    static String handToString(int[] hand) {
        String result = "";
        for (int i = 0; i < hand.length; i++)
            result += cardToName(hand[i]) + " ";
        return result.substring(0, result.length()-1);
    }
    static boolean isFlush(int[] hand) {
        for (int i = 1; i < hand.length; i++)
            if (!cardToSuit(hand[0]).equals(cardToSuit(hand[i])))
                return false;
        return true;
    }
    

}
