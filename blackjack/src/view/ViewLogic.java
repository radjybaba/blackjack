package view;

import model.Card;
import controller.ControllerLogic;

public class ViewLogic {
	
	private static ControllerLogic controller;
        
    /**
     *
     * @return
     */
    public static void getDeck(){
            
            controller = new ControllerLogic();
            controller.getDeck().shuffle();

        }
	
	
	public static String getImg(int i){
		
		
           //     controller = new ControllerLogic();
          //      controller.getDeck().shuffle();
		Card c = controller.getDeck().returnCard(i);
		String s = c.toString();
		
		s = "cards/"+ s.replace(' ','_') + ".jpg";

		return s;
		
		
	}
	

	public ViewLogic() {
		// TODO Auto-generated constructor stub
		
	}
/*
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ViewLogic c = new ViewLogic();
		c.getImg();

	}
	*/

}
