/*
 * 
 * 	Nadine Smair		308573252			Anton Anton		203323902
 *	Ameer Dow			203844956			Geryes Moussa 	301622635
 *
 *
 */

package controller;

import model.Card;
import model.Deck;
import model.Hand;
import model.ModelLogic;
import view.ViewLogic;

public class ControllerLogic {
	
	
	
	private static ModelLogic model;
    private static ViewLogic view;
    private static ControllerLogic instance;
    private static boolean exists = false;
	
    /**
     *
     */
    public ControllerLogic() {
		// TODO Auto-generated constructor stub

	}
    
    /* 
     * Creates an instance of the ControllerLogic along with  a model and an instance of the view 
     */
    
    public static ControllerLogic getInstance(){
    	if(!exists){
    		exists = true;
            model = new ModelLogic();
            instance = new ControllerLogic();
            view = ViewLogic.getInstance(instance);
            view.exceuteGame();
            }
    	return instance;
    }
    
	

	/* 
	 * returns the Deck that got created 
	 */
    
    public Deck getDeck(){
		return model.getDeck();
	}
	
    /*
     * Shuffles the deck
     */
    
	public void getShuffled(){
		model.getShuffled();    	
    }
	
	/*
	 * returns the card of position i of the deck
	 */
	
	public Card getCard(int i){
        return model.getCard(i);
    }
	
	public Card returnCard(Hand hand , int i){
		return model.returnCard(hand,i);
	}
	
	/*
	 *  new round (new game button action)
	 */
	
	public void newRound(){
		model.newRound();
		
	}
	
	
	/*
	 * returns player's hand
	 */
	
	public Hand getPlayerHand(){
		return model.getPlayerHand();
	}
	
	/*
	 * returns dealer's hand
	 */

	public Hand getDealerHand(){
		return model.getDealerHand();
	}
	
	/*
	 * hits the player with one card
	 */
	
	public void hit(){
		model.hit();		
	}
	
	/*
	 * the player chooses to stand and the dealer get cards
	 */
	
	public void stand(){
		 model.stand();
	}
	
	/*
	 * returns the player's current hand score
	 */
	
	public int getPlayerCurrentScore(){
		return model.getPlayerCurrentScore();
	}
	
	/*
	 * returns the dealer's current hand score
	 */
	
	public int getDealerCurrentScore(){
		return model.getDealerCurrentScore();
	}
        
        /*
        
        public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		

	}

	*/

	

}
