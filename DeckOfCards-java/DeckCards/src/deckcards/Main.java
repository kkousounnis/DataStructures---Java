package deckcards;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 DeckOfCards deck = new DeckOfCards();
	        for (int i = 0; i < 52; i++)
	            System.out.printf("%3s", deck.cardToName(deck.draw()));
	        System.out.printf("\n");
	        
	        // Shuffle the deck (reset to full deck)...
	        deck.shuffle();
	        
	        // Print a set of four bridge hands identified by compass directions...
	        String[] players = { "north", "south", "east", "west" };
	        for (String player : players) {
	            int[] hand = deck.drawHand(13);
	            System.out.printf("%6s: %s\n", player, deck.handToString(hand));
	        }
	        
	        // Generate a set of 5-card poker hands and count the number of flushes...
	        final int TRIALS = 10000;
	        int count = 0;
	        for (int i = 0; i < TRIALS; i++) {
	            deck.shuffle();  // shuffle after each trial
	            int[] hand = deck.drawHand(5);
	            if (deck.isFlush(hand)) {
	                System.out.printf("flush: %s\n", deck.handToString(hand));
	                count++;
	            }
	        }
	        System.out.printf("%d of %d hands were flushes: %.2f%%\n", count, TRIALS, (double) count/TRIALS*100);
	    
	}

}
