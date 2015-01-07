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
import model.Round.Winner;
import controller.ControllerLogic;



public class ViewLogic {

	private static ControllerLogic controller;
	private static ViewLogic instance;
	private static boolean exists = false;
//	private Table table;
	private WelcomeScreen welcome;


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
	 *

	public void getShuflled(){
		controller.getShuffled();
	}

	/*
	 * creates a view of the class Table or in our case the UI 
	 *

	public void exceuteTable(){
		table = new Table(instance , welcome);
		table.setVisible(true);
	}
	 */
	public void exceuteGame(){
		welcome = new WelcomeScreen(instance);
		welcome.setVisible(true);
	}



	/*
	 * Returns the path of the card of position i image as a string
	 *

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
	 * a method that checks if we got blackjack in either hand and returns who has it
	 */

	public Winner hasBlackJack(){
		return controller.hasBlackJack();
	}

	/*
	 * a method that checks if we got someone got busted in either hand and returns who has it
	 */

	public Winner hasBusted(){
		return controller.hasBusted();
	}

	/*
	 * a method that checks if we got a winner
	 */

	public Winner whoWon() {
		return controller.whoWon();
	}

	/*
	 * returns the winner as string
	 */

	public String winnerToString(Winner win){
		switch(win){
		case Dealer: return "Dealer";
		case Player: return "Player";
		default: return "No One";
		}
	}

	/*
	 * Returns true if the sign up was successful or false otherwise
	 */

	public boolean signUp(String username, String password){
		return controller.signUp(username, password);
	}

	/*
	 * Returns the user if the login was successful and null otherwise
	 */

	public boolean login(String username , String password){
		return controller.login(username, password);
	}

	/*
	 * returns the user requested stat
	 */

	public int userStats(int i){
		return controller.userStats(i);
	}

	/*
	 * resets the current game and starts new one
	 */

	public void resetGame(){
		controller.resetGame();
	}

	/*
	 * updates player's score depending who won
	 */

	public void updatePlayersScore(Winner win){
		controller.updatePlayersScore(win);
	}

	/*
	 * Saves user data to the serialized file
	 */

	public void saveData(){
		controller.saveData();
	}

	/*
	 * current round player's score getter
	 */

	public int getRoundsScore(){
		return controller.getRoundsScore();
	}

	/*
	 * current round number getter
	 */

	public int getRoundsTotal(){
		return controller.getRoundsTotal();
	}

	/*
	 * current round wins getter
	 */

	public int getRoundsWins(){
		return controller.getRoundsWins();
	}


	/*
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ViewLogic c = new ViewLogic();
		c.getImg();

	}
	 */

}
