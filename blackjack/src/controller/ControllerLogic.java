package controller;

import model.Card;
import model.Deck;
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
        
        /*
        
        public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		

	}

	*/

	

}
