/*
 * 
 * 	Nadine Smair		308573252			Anton Anton		203323902
 *	Ameer Dow			203844956			Geryes Moussa 	301622635
 *
 *
 */

package model;

import java.util.ArrayList;





public class Hand {
	
	private ArrayList<Card> cards;
//	private Card[] cards;
	private int score;

	public Hand() {
		// TODO Auto-generated constructor stub
		this.cards = new ArrayList<Card>();
		this.score = 0;
	}
	
	/*
	 * resets the hand for new round
	 */
	
	public void resetHand(){
		this.score = 0;
		this.cards.clear();
	}
	
	/*
	 * gets a card from the deck and adds it to the hand
	 */
	
	public void getCard(Card card){
		cards.add(card);
		
	}
	
	/*
	 * returns the card in the position i of the hand
	 */
	
	public Card getCard(int i) {
		return cards.get(i);
	}
	
	
	/*
	 * a setter for the score in the current hand
	 */
	
	public void setScore(int score) {
		this.score = score;
	}

	/*
	 * a getter for the score in the current hand
	 */
	
	public int getScore(){
		return this.score;
	}
	
	/*
	 * a method that returns the number of Aces in the current hand
	 */
	
	public int getNumOfAces(){
		int aces = 0;
		for(Card card : this.cards){
			if(card.isAce())
				aces++;
		}
		return aces;
	}
	
	public String toString(){
		return this.cards + "";
	}


	

}
