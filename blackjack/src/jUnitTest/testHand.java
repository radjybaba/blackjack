/*
 * 
 * 	Nadine Smair		308573252			Anton Anton		203323902
 *	Ameer Dow			203844956			Geryes Moussa 	301622635
 *
 *
 */
package jUnitTest;

import static org.junit.Assert.*;
import model.Card;
import model.Hand;

import org.junit.Test;

public class testHand {

	@Test
	public void testResetHand() {
		Hand hand = new Hand();
		hand.setScore(100);
		hand.resetHand();
		assertEquals(0 , hand.getScore());
	}

	@Test
	public void testGetCardCard() {
		Hand hand = new Hand();
		Card c1 = new Card(5,1);
		Card c2 = new Card(10,2);
		hand.getCard(c1);
		hand.getCard(c2);
		assertEquals(c1,hand.getCard(0));
		assertEquals(c2,hand.getCard(1));
	}


}
