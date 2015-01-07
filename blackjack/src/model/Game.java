/*
 * 
 * 	Nadine Smair		308573252			Anton Anton		203323902
 *	Ameer Dow			203844956			Geryes Moussa 	301622635
 *
 *
 */

package model;

import java.util.Date;



public class Game {
	

	

	//private User user;	// singleton
	private Round round; // singleton

	
	
	

	public Game(){
		System.out.println(((new Date()).toString())+": Game() constructor");
		System.out.println(((new Date()).toString())+": get an instance of Deck");
		Deck.getInstance();
		this.round = new Round();
	//	this.newRound();
	}
	
	public Game(User usr){
		System.out.println(((new Date()).toString())+": Game() constructor");
		System.out.println(((new Date()).toString())+": get an instance of Deck");
		Deck.getInstance();
		this.round = new Round(usr);
	//	this.user = usr;
	//	this.newRound();
	}
	
	
	/*
	 * starts new round
	 */
	
	public void newRound(){
		this.round.newRound();
		
	}
	
	/*
	 * hits the player with one card
	 */
	
	public void hit(){
		round.hit();		
	}
	
	/*
	 * the player chooses to stand and the dealer get cards
	 */
	
	public void stand(){
		round.stand();
	}
	
	/*
	 * a round getter
	 */

	public Round getRound() {
		return round;
	}

	
	
	
	
}
