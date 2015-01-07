/*
 * 
 * 	Nadine Smair		308573252			Anton Anton		203323902
 *	Ameer Dow			203844956			Geryes Moussa 	301622635
 *
 *
 */

package model;



/*
 * 
 * A test Class to print different tests and make sure the classes works perfectly
 * 
 * 
 */

public class test2 {

	public test2() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Deck cards = Deck.getInstance();
		Card temp;
		Hand hand = new Hand();
		
		Dealer dealer = new Dealer();
		
		//cards.returnCard(5).toString();
		
		Card c1 = new Card(11,1);
		Card c2 = new Card(12,2);
		Card c3 = new Card(1 ,3);
		dealer.getCard(c1);
		dealer.getCard(c2);
		dealer.getCard(c3);
		System.err.println(dealer.getCurrentScore());
		
	//	cards.shuffle();
		
		
		
		for(int i =0 ; i<13 ; i++){
			temp = cards.returnCard(i);
			System.out.print("["+ temp.getValueAsInt() +"]" + temp.toString() + ", ");
		}
		System.out.println();
		
		for(int i =13 ; i<26 ; i++){
			temp = cards.returnCard(i);
			System.out.print("["+ temp.getValueAsInt() +"]" + temp.toString() + ", ");
		}
		System.out.println();
		
		for(int i =26 ; i<39 ; i++){
			temp = cards.returnCard(i);
			System.out.print("["+ temp.getValueAsInt() +"]" + temp.toString() + ", ");
		}
		System.out.println();
		
		for(int i =39 ; i<52 ; i++){
			temp = cards.returnCard(i);
			System.out.print("["+ temp.getValueAsInt() +"]" + temp.toString() + ", ");
		}
		System.out.println();
		System.out.println();
		
		
		temp = cards.getCard();
		hand.setScore(temp.getValueAsInt());
		hand.getCard(temp);
		int score = hand.getScore();
		int aces = hand.getNumOfAces();
		System.out.println(hand.toString() + ", your score is: " + score + " your number of aces is: " + aces);
		
		temp = cards.getCard();
		hand.setScore(temp.getValueAsInt() + score);
		hand.getCard(temp);
		score = hand.getScore();
		aces = hand.getNumOfAces();
		System.out.println(hand.toString() + ", your score is: " + score + " your number of aces is: " + aces);
		

	}

}
