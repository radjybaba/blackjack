/*
 * 
 * 	Nadine Smair		308573252			Anton Anton		203323902
 *	Ameer Dow			203844956			Geryes Moussa 	301622635
 *
 *
 */

package controller;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.PrintStream;


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
            
	
            
       /*  
        * to change the system.out to a file
        */    
		
		PrintStream out = null;
		try {
			out = new PrintStream(new FileOutputStream("logFile.txt"));
		} catch (FileNotFoundException e) {
		}
		System.setOut(out);
         
		controller = ControllerLogic.getInstance();
		controller.toString();
            
         
            
            

	}

}
