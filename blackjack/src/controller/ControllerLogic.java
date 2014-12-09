package controller;

import model.Card;
import model.Deck;
import model.ModelLogic;

public class ControllerLogic {
	
	private static ModelLogic model;
	
	public ControllerLogic() {
		// TODO Auto-generated constructor stub
		model = new ModelLogic();
	}
	
	@SuppressWarnings("static-access")
	public static Deck getDeck(){
		return model.getDeck();
	}
	
	@SuppressWarnings("static-access")
	public static void getShuffled(){
    	model.getShuffled();    	
    }
	
    @SuppressWarnings("static-access")
	public static Card getCard(int i){
    	return model.getCard(i);
    }
        
        /*
        
        public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		

	}

	*/

	

}
