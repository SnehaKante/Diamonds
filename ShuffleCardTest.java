import java.util.ArrayList;
import java.util.Collections;


public class ShuffleCardTest {

	
	public String shuffleDiamondCards() {
		ArrayList d = new ArrayList();
		d.add("A");
		d.add("1");
		d.add("2");
		d.add("3");
		d.add("4");
		d.add("5");
		d.add("6");
		d.add("7");
		d.add("8");
		d.add("9");
		d.add("10");
		d.add("J");
		d.add("Q");
		d.add("K");
		
		
		Collections.shuffle(d);
		//System.out.println(d);
		//System.out.println(d.get(0));
		String top = (String) d.get(0);
		d.remove(0);
		return top;
		//System.out.println(d);

	}
	public static void main(String[] args) {
		System.out.println(new ShuffleCardTest().shuffleDiamondCards());
	}

}
