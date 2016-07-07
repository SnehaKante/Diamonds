public class Card {
	
	int seq;
	
	public Card (int seq) {
		this.seq = seq;
	}
	
	public char getPip() {
	String pips = "A23456789TJQK";
	return pips.charAt(seq % 13);
	}
	
	
	
	
	public static void main(String args[]) {
		Card c = new Card(15);
		System.out.println(c.getPip());
		
	}
	
} 
