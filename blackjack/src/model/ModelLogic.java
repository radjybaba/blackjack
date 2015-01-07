/*
 * 
 * 	Nadine Smair		308573252			Anton Anton		203323902
 *	Ameer Dow			203844956			Geryes Moussa 	301622635
 *
 *
 */

package model;



import model.Round.Winner;





public class ModelLogic {


	//    private static Deck cards;
	private Game game;
	private User user;




	/* 
	 * returns the Deck that got created 


    public Deck getDeck(){

		return cards;
	}


    /*
	 * Shuffles the deck


	public void getShuffled(){
    	cards.shuffle();    	
    }


	/*
	 * returns the card of position i of the deck
	 *

	public Card getCard(int i){
    	return cards.returnCard(i);
    }

	/*
	 * starts new round
	 */

	public void newRound(){
		game.newRound();

	}

	/*
	 * returns that i-th card of specific hand
	 */

	public Card returnCard(Hand hand , int i){
		return hand.getCard(i);
	}

	/*
	 * returns player's hand
	 */

	public Hand getPlayerHand(){
		return game.getRound().getPlayer().getHand();
	}


	/*
	 * returns dealer's hand
	 */

	public Hand getDealerHand(){
		return game.getRound().getDealer().getHand();
	}

	/*
	 * returns the player's current hand score
	 */

	public int getPlayerCurrentScore(){
		return game.getRound().getPlayer().getCurrentScore();
	}

	/*
	 * returns the dealer's current hand score
	 */

	public int getDealerCurrentScore(){
		return game.getRound().getDealer().getCurrentScore();
	}

	/*
	 * hits the player with one card
	 */

	public void hit(){
		game.hit();		
	}

	/*
	 * the player chooses to stand and the dealer get cards
	 */

	public void stand(){
		game.stand();
	}

	/*
	 * Returns true if the sign up was successful or false otherwise
	 */

	public boolean signUp(String username, String password){
		return User.signUp(new User(username, password));
	}

	/*
	 * Returns the user if the login was successful and null otherwise
	 */

	public boolean login(String username , String password){
		return !((this.user = User.login(username, password)) == null);
	}

	/*
	 * returns the user requested stat
	 */
	public int userStats(int i){

		if( this.user != null ){
			switch(i){
			case 0: return this.user.getHighscore();
			case 1: return this.user.getWins();
			case 2: return this.user.getTotalGames();
			}
		}
		return -997;
	}


	/*
	 * a method that checks if we got blackjack in either hand and returns who has it
	 */

	public Winner hasBlackJack(){
		return game.getRound().hasBlackJack();
	}

	/*
	 * a method that checks if we got someone got busted in either hand and returns who has it
	 */

	public Winner hasBusted(){
		return game.getRound().hasBusted();
	}

	/*
	 * a method that checks if we got a winner
	 */

	public Winner whoWon() {
		return game.getRound().whoWon();
	}

	/*
	 * resets the current game and starts new one
	 */

	public void resetGame(){
		this.game = new Game(this.user);
	}

	/*
	 * updates player's score depending who won
	 */

	public void updatePlayersScore(Winner win){
		this.game.getRound().updatePlayersScore(win);
	}

	/*
	 * Saves user data to the serialized file
	 */

	public void saveData(){
		User.saveUsersData();
	}

	/*
	 * current round player's score getter
	 */

	public int getRoundsScore(){
		return this.game.getRound().getPlayer().getScore();
	}

	/*
	 * current round number getter
	 */

	public int getRoundsTotal(){
		return this.game.getRound().getPlayer().getTotalGames();
	}

	/*
	 * current round wins getter
	 */

	public int getRoundsWins(){
		return this.game.getRound().getPlayer().getWins();
	}


	public ModelLogic() {

		this.game = new Game(this.user);
	}



}
