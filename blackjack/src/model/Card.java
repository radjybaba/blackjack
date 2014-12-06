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
              
private final int value;  // The value of this card, from 1 to 11.
             
public Card(int theValue, int theSuit) {
// Construct a card with the specified value and suit.
// Value must be between 1 and 13.  Suit must be between
// 0 and 3.  If the parameters are outside these ranges,
// the constructed card object will be invalid.
value = theValue;
suit = theSuit;
}

public int getSuit() {
// Return the int that codes for this card's suit.
return suit;
}

public int getValue() {
// Return the int that codes for this card's value.
return value;
}

public String getSuitAsString() {
// Return a String representing the card's suit.
// (If the card's suit is invalid, "??" is returned.)
switch ( suit ) {
case SPADES:   return "Spades";
case HEARTS:   return "Hearts";
case DIAMONDS: return "Diamonds";
case CLUBS:    return "Clubs";
default:       return "??";
}
}

public String getValueAsString() {
// Return a String representing the card's value.
// If the card's value is invalid, "??" is returned.
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

public int getValueAsInt() {
	// Return a String representing the card's value.
	// If the card's value is invalid, "??" is returned.
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
	default:  return 0;
	}
	}

public String toString() {
// Return a String representation of this card, such as
// "10 of Hearts" or "Queen of Spades".
return getValueAsString() + " of " + getSuitAsString();
}



	
}

/*
	
    public final static int SPADES = 0,       // Codes for the 4 suits.
    						HEARTS = 1,
    						DIAMONDS = 2,
    						CLUBS = 3;
            
    public final static int ACE = 1,          // Codes for the non-numeric cards.
            				JACK = 11,        //   Cards 2 through 10 have their 
            				QUEEN = 12,       //   numerical values for their codes.
            				KING = 13;
	
	private int value;			// value of the card
	private String suit;		// SPADES or HEARTS or DIAMONDS or CLUBS
	private int kind;			// the kind Ace ,2,3,4,5,6,7,8,9,10, Jack , Queen or King

	public String getSuit() {
		return suit;
	}

	public int getValue() {
		return value;
	}

	public int getKind() {
		return kind;
	}

	

	public void setValue(int value1) {
		this.value = value1;
	}



	public Card( int value1, int kind1 , int suit1) {
		// TODO Auto-generated constructor stub
		value = value1;
		kind = kind1;
		switch(suit1){
			case 0: suit = "Spades";
			case 1: suit = "Hearts";
			case 2: suit = "Diamonds";
			case 3: suit = "Clubs";
		}
		
	}
	
	public String getKindAsString() {
        // Return a String representing the card's kind.
        // If the card's kind is invalid, "??" is returned.
    switch ( kind ) {
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
	

 

	@Override
	public String toString() {
		return getKindAsString() + " of " + getSuit();
	}

}

*/
