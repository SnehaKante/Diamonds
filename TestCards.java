import java.util.ArrayList;
import java.util.Collections;


public class TestCards {
	
	
	

	public int shuffleDiamondCards() {
		ArrayList diamondStack = new ArrayList();
		for ( int i=13; i < 25; i++ ) {
			diamondStack.add(new Card(i).getPip());
		}
			
		return randomShuffle(diamondStack);
		
	}
	
	public int computerBid() {
		ArrayList list = new ArrayList();
		
		for ( int i=0; i < 13; i++ ) {
			list.add(new Card(i).getPip());
		}		
		
		return randomShuffle(list);
	}
	
	public int randomShuffle(ArrayList list) {
		Collections.shuffle(list);		
		int top =  (Integer) list.get(0);
		list.remove(0);
		return top;
	}
	
	public int userBid(int userBidCardSeq) {
		return new Card(userBidCardSeq).getPip();
	}
	
	public String winner(int userBidCardSeq) {
		int cardPipValue1 = new TestCards().computerBid();
		//int cardPipValue2 = new TestCards().userBid(36);
		int cardPipValue2 = userBidCardSeq;
		
		if (cardPipValue1 > cardPipValue2 ) 
			
			return "Computer wins the bid";
		else
			return "User wins the bid";
		
	}
	
	public boolean isGameOver(ArrayList computerCards, ArrayList userCards) {
		return computerCards.isEmpty() && userCards.isEmpty();
	}
	
	
	
	public static void main(String[] args) {
		System.out.println(new TestCards().computerBid());
		System.out.println(new TestCards().shuffleDiamondCards());
		System.out.println(new TestCards().userBid(Integer.parseInt(args[0])));
		System.out.println(new TestCards().winner(Integer.parseInt(args[0])));
		
	}

}