/*
 * 
 * 	Nadine Smair		308573252			Anton Anton		203323902
 *	Ameer Dow			203844956			Geryes Moussa 	301622635
 *
 *
 */
package jUnitTest;

import static org.junit.Assert.*;
import model.Deck;

import org.junit.Test;

public class testDeck {

	@Test
	public void testGetInstance() {
		Deck deck = Deck.getInstance();
		assertNotNull("not null" , deck);
	}
/*
	@Test
	public void testShuffle() {
	//	fail("Not yet implemented");
		Deck deck = Deck.getInstance();
		Card[] cards = new Card[52];
		for(int i=0 ; i<52 ; i++){
			cards[i] = deck.returnCard(i);
		}
		
		deck.shuffle();
		
		/*
		 * the test checks if the i-th card of the origin deck and the shuffled one are similar
		 * and stops when it finds the first match
		 *
	
		for(int i=0 ; i<52 ; i++){
			String s = i + "";
			assertNotEquals(s,deck.returnCard(i),cards[i] );
		}
		
		
		
	}
*/
	@Test
	public void testReturnCard() {
		Deck deck = Deck.getInstance();
		assertEquals("Ace of Spades",deck.returnCard(0).toString());
	}

	@Test
	public void testGetCard() {
		Deck deck = Deck.getInstance();
		assertEquals(deck.returnCard(51),deck.getCard());
		assertEquals(deck.returnCard(50),deck.getCard());
		assertEquals(deck.returnCard(49),deck.getCard());
	}

}
