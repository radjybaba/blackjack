package model;

public class Deck {
	
	private Card[] deck;
	private int cardsUsed;
	

	public Deck() {
		// TODO Auto-generated constructor stub
		deck = new Card[52];
		int cards = 0;
		for(int i =0 ; i<4 ; i++){
			for(int j = 1; j<14 ; j++){
				deck[cards] = new Card(j,i);
				cards++;
			}
		}
		cardsUsed = 0;

	}
	
	public void shuffle() {
        // Put all the used cards back into the deck, and shuffle it into
        // a random order.
      for ( int i = 51; i > 0; i-- ) {
          int rand = (int)(Math.random()*(i+1));
          Card temp = deck[i];
          deck[i] = deck[rand];
          deck[rand] = temp;
      }
      cardsUsed = 0;
  }
	
	public int cardsLeft() {
        // As cards are dealt from the deck, the number of cards left
        // decreases.  This function returns the number of cards that
        // are still left in the deck.
      return 52 - cardsUsed;
  }
	
	  public Card dealCard() {
          // Deals one card from the deck and returns it.
        if (cardsUsed == 52)
           shuffle();
        cardsUsed++;
        return deck[cardsUsed - 1];
    }
	  
	  public String printCards(int i){
		  return deck[i].toString();
		  
	  }
	  
	  public Card returnCard(int i){
		  return deck[i];
	  }
	


}
