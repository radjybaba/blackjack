package controller;


/*
 * 
 * 
 * 		The main class to run the Game
 * 
 * 
 * 
 * 
 * */

public class MainClass {
    
    
    private static ControllerLogic controller;

	public MainClass() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
            controller = ControllerLogic.getInstance();
            controller.getCard(5);
            
            

	}

}
