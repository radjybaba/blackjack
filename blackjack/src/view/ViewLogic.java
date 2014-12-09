package view;

import model.Card;
import model.Deck;
import controller.ControllerLogic;

public class ViewLogic {
	
	private static ControllerLogic controller;
        
    /**
     *
     * @return
     */
        public static void getDeck(){

                if(controller == null){
         //           System.out.println("controller is null");
                    controller = new ControllerLogic();
                    controller.getDeck().shuffle();
                }else{
          //          System.out.println("controller is NOT null");
                    controller.getDeck().shuffle();
                }

        }
  /*      
        public static void getShuflled(){
            if(controller != null)
                controller.getDeck().shuffle();     
        }
    */

	
	
	public static String getImg(int i){
		
		
         //  controller.getDeck();
		//     controller = new ControllerLogic();
          //      controller.getDeck().shuffle();
		Card c = controller.getDeck().returnCard(i);
		String s = c.toString();
                
                s = s.toLowerCase();
                s = s.replace(' ','_');
		
		s = "cards/"+ s + ".jpg";

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
