package model;

public class ModelLogic {
	
	
	private static Deck cards; 
	
    /**
     *
     * @return
     */
    public static Deck getDeck(){
		
		return cards;
	}

	public ModelLogic() {
		// TODO Auto-generated constructor stub
		cards = new Deck();
	}

	

}
