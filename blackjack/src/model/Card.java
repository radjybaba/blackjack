package model;

public class Card {

	public final static int SPADES = 0,       // Codes for the 4 suits.
			HEARTS = 1,
			DIAMONDS = 2,
			CLUBS = 3;

	public final static int ACE = 1,          // Codes for the non-numeric cards.
			JACK = 11,        //   Cards 2 through 10 have their 
			QUEEN = 12,       //   numerical values for their codes.
			KING = 13;

	private final int suit;   // The suit of this card, one of the constants
	//    SPADES, HEARTS, DIAMONDS, CLUBS.

	private final int value;  // The value of this card, from 1 to 13 in oder to know the card



	/* 
	 * Construct a card with the specified value and suit.
	 * Value must be between 1 and 13.  Suit must be between
	 * 0 and 3.  If the parameters are outside these ranges,
	 * the constructed card object will be invalid.
	 */
	public Card(int theValue, int theSuit) {
		value = theValue;
		suit = theSuit;
	}

	/*
	 * Return the int that codes for this card's suit.
	 */

	public int getSuit() {
		return suit;
	}

	/*
	 * Return the int that codes for this card's value.
	 */
	
	public int getValue() {
		return value;
	}

	/*
	 * Return a String representing the card's suit.
 	 * (If the card's suit is invalid, "??" is returned.)
	 */

	public String getSuitAsString() {
		switch ( suit ) {
		case SPADES:   return "Spades";
		case HEARTS:   return "Hearts";
		case DIAMONDS: return "Diamonds";
		case CLUBS:    return "Clubs";
		default:       return "??";
		}
	}
	
	/*
	 * Return a String representing the card's value.
	 * If the card's value is invalid, "??" is returned.
	 */

	public String getValueAsString() {
		switch ( value ) {
		case 1:   return "Ace";
		case 2:   return "2";
		case 3:   return "3";
		case 4:   return "4";
		case 5:   return "5";
		case 6:   return "6";
		case 7:   return "7";
		case 8:   return "8";
		case 9:   return "9";
		case 10:  return "10";
		case 11:  return "Jack";
		case 12:  return "Queen";
		case 13:  return "King";
		default:  return "??";
		}
	}
	
	/*
	 * Return an int representing the card's value.
	 * If the card's value is invalid, -1 is returned.
	 */

	public int getValueAsInt() {
		switch ( value ) {
		case 1:   return 11;
		case 2:   return 2;
		case 3:   return 3;
		case 4:   return 4;
		case 5:   return 5;
		case 6:   return 6;
		case 7:   return 7;
		case 8:   return 8;
		case 9:   return 9;
		case 10:  return 10;
		case 11:  return 10;
		case 12:  return 10;
		case 13:  return 10;
		default:  return -1;
		}
	}

	/*
	 * Return a String representation of this card, such as
	 * "10 of Hearts" or "Queen of Spades".
	 */

	public String toString() {
		return getValueAsString() + " of " + getSuitAsString();
	}




}


