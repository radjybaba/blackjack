/*
 * 
 * 	Nadine Smair		308573252			Anton Anton		203323902
 *	Ameer Dow			203844956			Geryes Moussa 	301622635
 *
 *
 */

package view;


import java.io.IOException;


import javax.sound.sampled.AudioInputStream;



import javax.sound.sampled.AudioSystem;
import javax.sound.sampled.Clip;
import javax.sound.sampled.LineUnavailableException;
import javax.sound.sampled.UnsupportedAudioFileException;

import model.Card;
import model.Hand;
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

		s = "cards/"+ s + ".png";

		return s;
	}
	
	/*
	 * Returns the path of the card of position i image as a string of specific hand
	 */
	
	public String getImgPath(Hand hand, int i){
		Card c = controller.returnCard(hand, i);
		String s = c.toString();
		s = s.toLowerCase();
		s = s.replace(' ','_');

		s = "cards/"+ s + ".png";

		return s;
	}


	public ViewLogic(ControllerLogic control) {
		// TODO Auto-generated constructor stub
		controller = control;

	}
	
	
	/*
	 * returns player's hand
	 */
	
	public Hand getPlayerHand(){
		return controller.getPlayerHand();
	}


	/*
	 * returns dealer's hand
	 */
	
	public Hand getDealerHand(){
		return controller.getDealerHand();
	}
	
	/*
	 * hits the player with one card
	 */
	
	public void hit(){
		controller.hit();		
	}
	
	/*
	 * the player chooses to stand and the dealer get cards
	 */
	
	public void stand(){
		controller.stand();
	}
	
	/*
	 * returns the player's current hand score
	 */
	
	public int getPlayerCurrentScore(){
		return controller.getPlayerCurrentScore();
	}
	
	/*
	 * returns the dealer's current hand score
	 */
	
	public int getDealerCurrentScore(){
		return controller.getDealerCurrentScore();
	}
	
	/*
	 * returns that i-th card of specific hand
	 */
	
	public Card returnCard(Hand hand , int i){
		return controller.returnCard(hand,i);
	}
	
	/*
	 * starts new round
	 */
	
	public void newRound(){
		controller.newRound();
	}
	
	
	/*
	 * the shuffle sound method
	 */
	
	public void shuffleSound() throws LineUnavailableException{
		try {
			AudioInputStream audioIn = AudioSystem.getAudioInputStream(ViewLogic.class.getResource("sounds/cardShuffle.wav"));
			Clip clip = AudioSystem.getClip();
			clip.open(audioIn);
			clip.start();
		} catch (UnsupportedAudioFileException | IOException e) {
		}
	}
	
	/*
	 * one card hit/stand sound
	 */
	
	public void cardSound(int i) throws LineUnavailableException{
		try {
			AudioInputStream audioIn = AudioSystem.getAudioInputStream(ViewLogic.class.getResource("sounds/cardSlide.wav"));
			Clip clip = AudioSystem.getClip();
			clip.open(audioIn);
			clip.loop(i);
		} catch (UnsupportedAudioFileException | IOException e) {
		}
	}
        
       
	
	/*
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ViewLogic c = new ViewLogic();
		c.getImg();

	}
	 */

}
