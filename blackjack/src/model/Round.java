/*
 * 
 * 	Nadine Smair		308573252			Anton Anton		203323902
 *	Ameer Dow			203844956			Geryes Moussa 	301622635
 *
 *
 */

package model;

import java.util.Date;

public class Round {
	
	public final int BLACKJACK = 21;
	
	/*
	 * an enum that declares the winner
	 */
	public enum Winner {
	    noOne , Player , Dealer 
	}
	
	private int roundNubmer;
	private Player player;
	private Dealer dealer;

	public Round() {
		this.roundNubmer = 1;
		this.player = new Player();
		this.dealer = new Dealer();
		System.out.println(((new Date()).toString())+": Round() constructor, round number: " +  this.roundNubmer );
	}
	
	/*
	 * a method that starts a new round
	 * increasing roundNumer by one
	 * rests both dealer and player hands
	 * and deals the first 4 cards 2 to each side
	 */
	
	public void newRound(){	
		this.roundNubmer++;
		
		this.player.resetHand();
		this.dealer.resetHand();
		this.player.getCard(this.dealer.giveCard());
		this.player.getCard(this.dealer.giveCard());
		this.dealer.getCard(this.dealer.giveCard());
		this.dealer.getCard(this.dealer.giveCard());
		
		System.out.println(((new Date()).toString())+": new round: " +  this.roundNubmer );
		System.out.println(((new Date()).toString())+": player's current round score is: " + this.player.getCurrentScore());
		
	}
	
	/*
	 * a method that checks if we got blackjack in either hand and returns who has it
	 */
	
	public Winner hasBlackJack(){
		if(dealer.getCurrentScore() == BLACKJACK){
			return Winner.Dealer;
		}
		if(player.getCurrentScore() == BLACKJACK){
			return Winner.Player;
		}
		return Winner.noOne;
	}
	
	/*
	 * a method that checks if we got someone got busted in either hand and returns who has it
	 */
	
	public Winner hasBusted(){
		if(player.getCurrentScore() > BLACKJACK){
			return Winner.Player;
		}if(dealer.getCurrentScore() > BLACKJACK){
			return Winner.Dealer;
		}
		return Winner.noOne;
	}
	
	/*
	 * a method that checks if we got a winner
	 */
	
	public Winner whoWon(){
		return (player.getCurrentScore() > dealer.getCurrentScore() )&& (player.getCurrentScore() <= BLACKJACK) ? Winner.Player : Winner.Dealer ;
	}
	
	
		
	/*
	 * checks if the game should stop or not
	 */
	
	public boolean gameShouldStop(){
		return !(this.hasBusted() == Winner.noOne && this.hasBlackJack() == Winner.noOne );
	}
	
	/*
	 * a method to perform the hit option in the game (by giving the player one more card)
	 */
	
	public void hit(){
		Card c = this.dealer.giveCard();
		this.player.getCard(c);
	}
	
	/*
	 * a method that perform the stand option in game (by letting the dealer dealing cards to himself)
	 * while checking when to stop dealing cards to himself
	 */
	
	public void stand(){
		//while(this.dealer.getCurrentScore() < 17 ){
		Card c = this.dealer.giveCard();
		this.dealer.getCard(c);
	//	}
	}

	
	/*
	 * a getter for the roundNumber
	 */
	

	public int getRoundNubmer() {
		return roundNubmer;
	}
	
	
	/*
	 * various getters
	 */

	public Player getPlayer() {
		return player;
	}

	public Dealer getDealer() {
		return dealer;
	}

	


}
