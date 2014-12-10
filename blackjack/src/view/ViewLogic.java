package view;

import model.Card;

import controller.ControllerLogic;



public class ViewLogic {

	private static ControllerLogic controller;
	private static ViewLogic instance;
	private static boolean exists = false;
	private Table table;

	
	/*
	 * creates an instance of the ViewLogic 
	 */
	
	public static ViewLogic getInstance(ControllerLogic c){
		if(!exists){
			exists = true;
			instance = new ViewLogic(c);
		}
		return instance;
	}


	/*
     * Shuffles the deck
     */
	
	public void getShuflled(){
		controller.getShuffled();
	}

	/*
	 * creates a view of the class Table or in our case the UI 
	 */
	
	public void exceuteGame(){
		table = new Table(instance);
		table.setVisible(true);
	}



	/*
	 * Returns the path of the card of position i image as a string
	 */
	
	public String getImg(int i){
		Card c = controller.getCard(i);
		String s = c.toString();

		s = s.toLowerCase();
		s = s.replace(' ','_');

		s = "cards/"+ s + ".jpg";

		return s;


	}


	public ViewLogic(ControllerLogic control) {
		// TODO Auto-generated constructor stub
		controller = control;

	}
	
	/*
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ViewLogic c = new ViewLogic();
		c.getImg();

	}
	 */

}
