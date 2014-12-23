/*
 * 
 * 	Nadine Smair		308573252			Anton Anton		203323902
 *	Ameer Dow			203844956			Geryes Moussa 	301622635
 *
 *
 */

package controller;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
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
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.setOut(out);
         
		controller = ControllerLogic.getInstance();    
            
            /*
             * serializable 
             * 
            String[] str1 = {};
            try
            { 
            //	String str = "Amtpm";
            //	String[] str1 = {"Geryes","Moussa"};
            
               FileOutputStream fileOut = new FileOutputStream("./employee.ser");
               ObjectOutputStream out = new ObjectOutputStream(fileOut);
               out.writeObject(str1);
               out.close();
               fileOut.close();
               System.out.println("Serialized data is saved in /tmp/employee.ser");
               
            	
            	FileInputStream fileIn = new FileInputStream("./employee.ser");
                ObjectInputStream in = new ObjectInputStream(fileIn);
                try {
					str1 = (String[]) in.readObject();
				} catch (ClassNotFoundException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
                in.close();
                fileIn.close(); 
            }catch(IOException i)
            {
                i.printStackTrace();
            }
            System.err.println(str1.toString());
            */
            controller.getCard(5);
            
           // System.out.println("dealer score is: " + controller.getDealerCurrentScore() + " player score is: " + controller.getPlayerCurrentScore());
            
            
            
            

	}

}
