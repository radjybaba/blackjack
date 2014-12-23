/*
 * 
 * 	Nadine Smair		308573252			Anton Anton		203323902
 *	Ameer Dow			203844956			Geryes Moussa 	301622635
 *
 *
 */

package model;

public class Deck {

	private  Card[] deck;
	private  int cardsUsed;
	private static Deck instance = null;

	
	/*
	 * the Deck constructor
	 */

	protected Deck() {
		// TODO Auto-generated constructor stub
		deck = new Card[52];
		int cards = 0;
		for(int i =0 ; i<4 ; i++){
			for(int j = 1; j<14 ; j++){
				deck[cards] = new Card(j,i);
				cards++;

			}
		}
		cardsUsed = 0;
	}
	
	/*
	 * a getter for the cardsUsed field in the class
	 */

	public int getCardsUsed() {
		return cardsUsed;
	}
	
	/*
	 * creates an instance of Deck and returns it
	 */

	public static Deck getInstance(){
		if(instance == null){	
			instance = new Deck();
		}
		return instance;
	}

	/*
	 * Put all the used cards back into the deck, and shuffle it into a random order.
	 */
	
	public void shuffle() {
		for ( int i = 51; i > 0; i-- ) {
			int rand = (int)(Math.random()*(i+1));
			Card temp = this.deck[i];
			this.deck[i] = this.deck[rand];
			this.deck[rand] = temp;
		}
		this.cardsUsed = 0;
	}
	
	/*
	 * As cards are dealt from the deck, the number of cards left decreases.
	 * This function returns the number of cards that are still left in the deck.
	 */

	public int cardsLeft() {
		return 52 - this.cardsUsed;
	}

	/*
	 * Deals one card from the deck and returns it.
	 */
	
	public Card dealCard() {
		if (this.cardsUsed == 52)
			shuffle();
		this.cardsUsed++;
		return this.deck[this.cardsUsed - 1];
	}
	
	
	/*
	 * a method to increase the cardsUsed by one
	 */
	
	
	public void increaseUsed(){
		this.cardsUsed++;
	}
	
	/*
	 * returns the toString of the card in position i
	 */
	
	public String printCards(int i){
		return this.deck[i].toString();

	}
	
	/*
	 * returns the card of position i of the deck
	 */
	
	public  Card returnCard(int i){
		return this.deck[i];
	}
	
	/*
	 * a method that returned the next card in line depending on the cardsUsed in the deck
	 */
	
	public Card getCard(){
		//this.cardsUsed++;
		return this.deck[52-(++this.cardsUsed)];
	}






}


