import java.util.ArrayList;
import java.util.Collections;


public class PlayDiamonds {
	
	
	public ArrayList list;

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
		int cardPipValue1 = 0;
		if(new PlayDiamonds().computerBid().charAt(0) == 'A')
			cardPipValue1 = 1;
		else if(new PlayDiamonds().computerBid().charAt(0) == 'T')
			cardPipValue1 = 10;	
		else if(new PlayDiamonds().computerBid().charAt(0) == 'J')
			cardPipValue1 = 11;	
		else if(new PlayDiamonds().computerBid().charAt(0) == 'Q')
			cardPipValue1 = 12;
		else if(new PlayDiamonds().computerBid().charAt(0) == 'K')
			cardPipValue1 = 13;
		else cardPipValue1 = (int)(new PlayDiamonds().computerBid().charAt(0));	
			
		int cardPipValue2 = 0;
		if(new PlayDiamonds().computerBid().charAt(0) == 'A')
			cardPipValue2 = 1;
		else if(new PlayDiamonds().userBid(userBidCardSeq).charAt(0) == 'T')
			cardPipValue2 = 10;	
		else if(new PlayDiamonds().userBid(userBidCardSeq).charAt(0) == 'J')
			cardPipValue2 = 11;	
		else if(new PlayDiamonds().userBid(userBidCardSeq).charAt(0) == 'Q')
			cardPipValue2 = 12;
		else if(new PlayDiamonds().userBid(userBidCardSeq).charAt(0) == 'K')
			cardPipValue2 = 13;	
		else cardPipValue2 = (int) (new PlayDiamonds().userBid(userBidCardSeq).charAt(0));	
				
		
		if (cardPipValue1 > cardPipValue2 )
			return "Computer wins the bid";
		else
			return "User wins the bid";
	}
	
	public boolean isGameOver(ArrayList computerCards, ArrayList userCards) {
		return computerCards.isEmpty() && userCards.isEmpty();
	}
	
	
	
	public static void main(String[] args) {
		System.out.println(new PlayDiamonds().computerBid());
		System.out.println(new PlayDiamonds().shuffleDiamondCards());
		System.out.println(new PlayDiamonds().userBid(31));
		System.out.println(new PlayDiamonds().winner(31));
		
	}

}
