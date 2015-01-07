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

	private int roundNumber;
	private Player player;
	private Dealer dealer;
	private User user;

	public Round(User usr) {
		this.user = usr;
		this.roundNumber = 1;
		this.player = new Player(this.user);
		this.dealer = new Dealer();
		System.out.println(((new Date()).toString())+": Round() constructor, round number: " +  this.roundNumber );
	}

	public Round() {
		this.roundNumber = 1;
		this.player = new Player();
		this.dealer = new Dealer();
		System.out.println(((new Date()).toString())+": Round() constructor, round number: " +  this.roundNumber );
	}

	/*
	 * a method that starts a new round
	 * increasing roundNumer by one
	 * rests both dealer and player hands
	 * and deals the first 4 cards 2 to each side
	 */

	public void newRound(){	
		this.roundNumber++;
		System.out.println(((new Date()).toString())+": Player's total score: " +  this.player.getScore() );

		this.player.resetHand();
		this.dealer.resetHand();
		this.player.getCard(this.dealer.giveCard());
		this.player.getCard(this.dealer.giveCard());
		this.dealer.getCard(this.dealer.giveCard());
		this.dealer.getCard(this.dealer.giveCard());

		System.out.println(((new Date()).toString())+": new round: " +  this.roundNumber );
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
		Winner win = (player.getCurrentScore() > dealer.getCurrentScore() )&& (player.getCurrentScore() <= BLACKJACK) ? Winner.Player : Winner.Dealer ;
		Winner busted = hasBusted();
		Winner blackjack = hasBlackJack();

		if(busted == Winner.Dealer || blackjack == Winner.Player){
			return Winner.Player;
		}else if(busted == Winner.Player || blackjack == Winner.Dealer){
			return Winner.Dealer;
		}else{
			return win;
		}
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
		Card c = this.dealer.giveCard();
		this.dealer.getCard(c);
	}

	/*
	 * Updates current score for the player stats
	 */

	public void updatePlayersScore(Winner win){
		int currentScore = this.player.getCurrentScore();
		int check = this.roundNumber % 2;
		int preLoss = this.player.getLoss();

		if(win == Winner.Dealer){
			this.player.icreaseLoss();
			currentScore *= -1;
		}

		if( check == 1){
			currentScore = currentScore * 2;
		}else{
			currentScore = currentScore * 3;
		}

		this.player.icreaseGames();
		System.out.println(((new Date()).toString())+": Player's total rounds in this game: " +  this.player.getTotalGames() + " wins: "+ this.player.getWins() + " losses: " + this.player.getLoss() );
		int temp = this.player.getScore();
		if((currentScore + temp) < 0 ){
			this.player.setScore(0);
		}else{
			this.player.setScore(currentScore + temp);
		}


		int score = this.player.getScore();

		int loss = this.player.getLoss();

		if((score + this.user.getHighscore()) < 0 ){
			score = 0;
		}else{
			score = score + this.user.getHighscore();
		}

		int total = 1 + this.user.getTotalGames();
		if(preLoss != loss){
			loss = 1 + this.user.getLosses();
		}

		this.user.setHighscore(score);
		this.user.setLosses(loss);
		this.user.setTotalGames(total);

	}

	/*
	 * a getter for the roundNumber
	 */


	public int getroundNumber() {
		return roundNumber;
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

	/*
	 * Updates user stat
	 *
	public void updateUserStats(){
		int score = this.player.getScore() + this.user.getHighscore();
		int losses = this.player.getLoss() + this.user.getLosses();
		int total = this.player.getTotalGames() + this.user.getTotalGames();
		System.err.println("player.updateUserStats, score: " + score );
		System.err.println("player.updateUserStats, totalgames: " + total );
		System.err.println("player.updateUserStats, losses: " + losses );
		this.user.setHighscore( score );
		this.user.setLosses( losses );
		this.user.setTotalGames( total );
	}

*/

}
