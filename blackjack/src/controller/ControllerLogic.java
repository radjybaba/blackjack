/*
 * 
 * 	Nadine Smair		308573252			Anton Anton		203323902
 *	Ameer Dow			203844956			Geryes Moussa 	301622635
 *
 *
 */

package controller;

import model.Card;
import model.Hand;
import model.ModelLogic;

import model.Round.Winner;
import view.ViewLogic;

public class ControllerLogic {



	private static ModelLogic model;
	private static ViewLogic view;
	private static ControllerLogic instance;
	private static boolean exists = false;

	/**
	 *
	 */
	public ControllerLogic() {
		// TODO Auto-generated constructor stub

	}

	/* 
	 * Creates an instance of the ControllerLogic along with  a model and an instance of the view 
	 */

	public static ControllerLogic getInstance(){
		if(!exists){
			exists = true;
			model = new ModelLogic();
			instance = new ControllerLogic();
			view = ViewLogic.getInstance(instance);
			view.exceuteGame();
		}
		return instance;
	}


	/*
	 * returns that i-th card of specific hand
	 */

	public Card returnCard(Hand hand , int i){
		return model.returnCard(hand,i);
	}

	/*
	 *  new round (new game button action)
	 */

	public void newRound(){
		model.newRound();

	}


	/*
	 * returns player's hand
	 */

	public Hand getPlayerHand(){
		return model.getPlayerHand();
	}

	/*
	 * returns dealer's hand
	 */

	public Hand getDealerHand(){
		return model.getDealerHand();
	}

	/*
	 * hits the player with one card
	 */

	public void hit(){
		model.hit();		
	}

	/*
	 * the player chooses to stand and the dealer get cards
	 */

	public void stand(){
		model.stand();
	}

	/*
	 * returns the player's current hand score
	 */

	public int getPlayerCurrentScore(){
		return model.getPlayerCurrentScore();
	}

	/*
	 * returns the dealer's current hand score
	 */

	public int getDealerCurrentScore(){
		return model.getDealerCurrentScore();
	}

	/*
	 * a method that checks if we got blackjack in either hand and returns who has it
	 */

	public Winner hasBlackJack(){
		return model.hasBlackJack();
	}

	/*
	 * a method that checks if we got someone got busted in either hand and returns who has it
	 */

	public Winner hasBusted(){
		return model.hasBusted();
	}

	/*
	 * a method that checks if we got a winner
	 */

	public Winner whoWon() {
		return model.whoWon();
	}

	/*
	 * Returns true if the sign up was successful or false otherwise
	 */

	public boolean signUp(String username, String password){
		return model.signUp(username, password);
	}

	/*
	 * Returns the user if the login was successful and null otherwise
	 */

	public boolean login(String username , String password){
		return model.login(username, password);
	}

	/*
	 * returns the user requested stat
	 */

	public int userStats(int i){
		return model.userStats(i);
	}

	/*
	 * resets the current game and starts new one
	 */

	public void resetGame(){
		model.resetGame();
	}

	/*
	 * updates player's score depending who won
	 */

	public void updatePlayersScore(Winner win){
		model.updatePlayersScore(win);
	}


	/*
	 * Saves user data to the serialized file
	 */

	public void saveData(){
		model.saveData();
	}

	/*
	 * current round player's score getter
	 */

	public int getRoundsScore(){
		return model.getRoundsScore();
	}

	/*
	 * current round number getter
	 */

	public int getRoundsTotal(){
		return model.getRoundsTotal();
	}

	/*
	 * current round wins getter
	 */

	public int getRoundsWins(){
		return model.getRoundsWins();
	}


	/*

        public static void main(String[] args) {
		// TODO Auto-generated method stub



	}

	 */



}
