package controller;

import model.Deck;
import model.ModelLogic;

public class ControllerLogic {
	
	private static ModelLogic model;
	
	public ControllerLogic() {
		// TODO Auto-generated constructor stub
		model = new ModelLogic();
	}
	
	public static Deck getDeck(){
		return model.getDeck();
	}

	

	

}
