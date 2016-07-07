import java.util.ArrayList;
import java.util.Collections;


public class PlayDiamonds {

	public String shuffleDiamondCards() {
		ArrayList diamondStack = new ArrayList();
		for ( int i=13; i < 25; i++ ) {
			diamondStack.add(new Card(i).displayCard());
		}
			
		return randomShuffle(diamondStack);
		
	}
	
	public String computerBid() {
		ArrayList list = new ArrayList();
		
		for ( int i=0; i < 13; i++ ) {
			list.add(new Card(i).displayCard());
		}		
		
		return randomShuffle(list);
	}
	
	public String randomShuffle(ArrayList list) {
		Collections.shuffle(list);		
		String top =   (String) list.get(0);
		list.remove(0);
		return top;
	}
	
	public String userBid(int userBidCardSeq) {
		return new Card(userBidCardSeq).displayCard();
	}
	
	public String winner(int userBidCardSeq) {
		if (new PlayDiamonds().computerBid().charAt(0) > new PlayDiamonds().userBid(userBidCardSeq).charAt(0) )
			return "Computer wins the bid";
		else
			return "User wins the bid";
	}
	
	public static void main(String[] args) {
		System.out.println(new PlayDiamonds().computerBid());
		System.out.println(new PlayDiamonds().shuffleDiamondCards());
		System.out.println(new PlayDiamonds().userBid(31));
		System.out.println(new PlayDiamonds().winner(31));
	}

}
