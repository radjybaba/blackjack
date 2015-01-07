package jUnitTest;

import static org.junit.Assert.*;
import model.Deck;
import model.Round;
import model.Round.Winner;

import org.junit.Test;

public class testRound {

	@Test
	public void testHasBlackJack() {
		Round round = new Round();
		Deck.getInstance().shuffle();
		round.hit();
		round.hit();

		
		assertEquals(round.hasBlackJack() , Winner.Player);
	}

	@Test
	public void testHasBusted() {
		Round round = new Round();
		//Deck.getInstance().shuffle();
		round.hit();
		round.hit();
		round.hit();
		
		assertEquals(round.hasBusted() , Winner.Player);
	}

	@Test
	public void testWhoWon() {
		Round round = new Round();
		//Deck.getInstance().shuffle();
		round.hit();
		round.hit();
		round.hit();
		round.stand();
		round.stand();
		
		assertEquals(round.whoWon() , Winner.Dealer);
		//assertEquals(round.whoWon() , Winner.Player);
	}

}
