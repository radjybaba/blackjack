/*
 * 
 * 	Nadine Smair		308573252			Anton Anton		203323902
 *	Ameer Dow			203844956			Geryes Moussa 	301622635
 *
 *
 */

package model;

import java.util.Date;

public class Dealer {
	
	public final int BLACKJACK = 21;
	
//	private int wins;
//	private int loss;
//	private int totalGames;
	private Hand hand;
	private int score;

	public Dealer() {
		// TODO Auto-generated constructor stub
		this.hand = new Hand();
		this.score = 0;
	}
	
	/*
	 * resets the dealer hand in order to start new round and on the way shuffles the deck
	 * 
	 */
	
	public void resetHand(){
		hand.resetHand();
		System.out.println(((new Date()).toString())+": resets dealer's hand and shuffles the deack"  );
		shuffleDeck();
	}
	
	/*
	 * shuffle method to shuffle the deck
	 */
	
	public void shuffleDeck(){
		Deck.getInstance().shuffle();
	}
	

	/*
	 * getting a card from the deck and returning it
	 */
	
	public Card giveCard(){
		return Deck.getInstance().getCard();
	}
	
	
	/*
	 * gives the dealer a card and putting it in his hand (the dealer gives himself) and checking whether he has ace or not to update the score
	 */
	
	public void getCard(Card card){
		int temp = this.hand.getScore() + card.getValueAsInt();
	//	System.out.println("dealer.getcard  :dealer score is: " + temp);
		
		if (temp > BLACKJACK && card.isAce()){
			this.hand.setScore(temp - 10);
			System.out.println(((new Date()).toString())+": Stand dealer gets card: "+ card.toString() + ", dealer's current score is: " + (temp-10) );
		}else{
			System.out.println(((new Date()).toString())+": Stand dealer gets card: "+ card.toString() + ", dealer's current score is: " + temp );
			this.hand.setScore(temp);
		}
		hand.getCard(card);
	}
	
	/*
	 * a getter for the current score for the dealer in the current hand
	 */
	
	public int getCurrentScore(){
		return this.hand.getScore();
	}
	
	/*
	 * a getter for the score in the Dealer class
	 */
	
	public int getScore() {
		return score;
	}
	
	/*
	 * a getter for the dealer's hand
	 */
	
	public Hand getHand() {
		return hand;
	}

}
