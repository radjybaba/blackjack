package model;

public class ModelLogic {
	
	
    private static Deck cards;
	
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

	public ModelLogic() {
		// TODO Auto-generated constructor stub
		cards = Deck.getInstance(); 
	}

	

}
