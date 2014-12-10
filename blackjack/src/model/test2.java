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
		
		
		//cards.returnCard(5).toString();
		

		
		
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

	}

}
