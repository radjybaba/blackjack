/*
 * 
 * 	Nadine Smair		308573252			Anton Anton		203323902
 *	Ameer Dow			203844956			Geryes Moussa 	301622635
 *
 *
 */

package model;



public class ModelLogic {
	
	
    private static Deck cards;
    private static Game game;
//    private User user;
    
    
    
	
    /* 
	 * returns the Deck that got created 
	 */
    
    public Deck getDeck(){
		
		return cards;
	}
    
    
    /*
     * Shuffles the deck
     */
    
	public void getShuffled(){
    	cards.shuffle();    	
    }
    
	
	/*
	 * returns the card of position i of the deck
	 */
	
	public Card getCard(int i){
    	return cards.returnCard(i);
    }
	
	/*
	 * starts new round
	 */
	
	public void newRound(){
		game.newRound();
		
	}
	
	/*
	 * returns that i-th card of specific hand
	 */
	
	public Card returnCard(Hand hand , int i){
		return hand.getCard(i);
	}
	
	/*
	 * returns player's hand
	 */
	
	public Hand getPlayerHand(){
		return game.getRound().getPlayer().getHand();
	}

	
	/*
	 * returns dealer's hand
	 */
	
	public Hand getDealerHand(){
		return game.getRound().getDealer().getHand();
	}
	
	/*
	 * returns the player's current hand score
	 */
	
	public int getPlayerCurrentScore(){
		return game.getRound().getPlayer().getCurrentScore();
	}
	
	/*
	 * returns the dealer's current hand score
	 */
	
	public int getDealerCurrentScore(){
		return game.getRound().getDealer().getCurrentScore();
	}
	
	/*
	 * hits the player with one card
	 */
	
	public void hit(){
		game.hit();		
	}
	
	/*
	 * the player chooses to stand and the dealer get cards
	 */
	
	public void stand(){
		game.stand();
	}
	
	/*
	public boolean signUp(String username, String password){
    	return User.signUp(new User(username, password));
    }
	
	public boolean login(String username , String password){
		return !((this.user = User.login(username, password)).equals(null));
	}

*/

	public ModelLogic() {
		// TODO Auto-generated constructor stub
		cards = Deck.getInstance(); 
		game = new Game();
	}

	

}
