package model;

public class ModelLogic {
	
	
	private static Deck cards;
	//private static Card card;
	
    /**
     *
     * @return
     */
    public static Deck getDeck(){
		
		return cards;
	}
    
    @SuppressWarnings("static-access")
	public static void getShuffled(){
    	cards.shuffle();    	
    }
    
    @SuppressWarnings("static-access")
	public static Card getCard(int i){
    	return cards.returnCard(i);
    }

	public ModelLogic() {
		// TODO Auto-generated constructor stub
		cards = Deck.getInstance();   // cards.getInstance();
	}

	

}
