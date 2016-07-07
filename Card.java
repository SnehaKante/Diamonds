
 class Card {
	
	int seq;
	
	public Card (int seq) {
		this.seq = seq;
	}
	
	public char getPip() {
		String pips = "A23456789TJQK";
		return pips.charAt(this.seq % 13);
	}
	
	public String getSuit() {
		String[] cdhs = { "club", "diamond", "heart", "spade" };
		return cdhs[this.seq / 13];
	}
	
	public String displayCard() {
	    return getPip()+" of "+getSuit();
	}
	
	
	
	public static void main(String args[]) {
		Card c = new Card(15);
		System.out.println(c.displayCard());
		
		
	}
	
} 
	
	
