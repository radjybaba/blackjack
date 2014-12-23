/*
 * 
 * 	Nadine Smair		308573252			Anton Anton		203323902
 *	Ameer Dow			203844956			Geryes Moussa 	301622635
 *
 *
 */

package model;

import java.util.Date;

public class Player {
	
	
//	private User user;
//	private int wins;
//	private int loss;
//	private int totalGames;
	private Hand hand;
	private int score;
	

	public Player() {
		// TODO Auto-generated constructor stub
		this.hand = new Hand();
		this.score = 0;
	}

	
	/*
	 * resets the player hand in order to start new round
	 * 
	 */
	
	public void resetHand(){
		hand.resetHand();
		System.out.println(((new Date()).toString())+": resets player's hand, score is: "+ this.score  );
	}
	
	/*
	 * gives the player a card and putting it in his hand (the dealer gives him) and checking whether he has ace or not to update the score
	 */

	public void getCard(Card card){
		if(this.hand.getNumOfAces() > 0 && card.isAce()){
			System.out.println(((new Date()).toString())+": Hit player with card: "+ card.toString() + ", player's current score is: " + (this.hand.getScore() + 1) );
			this.hand.setScore(this.hand.getScore() + 1);
		}else{
			System.out.println(((new Date()).toString())+": Hit player with card: "+ card.toString() + ", player's current score is: " + (this.hand.getScore() + card.getValueAsInt()) );
			this.hand.setScore(this.hand.getScore() + card.getValueAsInt());
		}
		hand.getCard(card);
	}
	
	/*
	 * a getter for the score in the Player class
	 */
	
	public int getScore(){
		return this.score;
	}
	
	/*
	 * a getter for the current score for the player in the current hand
	 */
	
	public int getCurrentScore(){
		return this.hand.getScore();
	}


	/*
	 * a getter for the player's hand
	 */
	
	public Hand getHand() {
		return hand;
	}
	
	

}
