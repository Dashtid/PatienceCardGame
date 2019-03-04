import pair.Pair;
import pair.PairSet;

public class PairMain {

	private static final double NBR_ITERATIONS = 10000;

	public static void main(String[] args) {
		int q = 0;
		//int w = 0;
		double wins = 0; // antal vinster

		for (int i = 0; i < NBR_ITERATIONS; i++) {
			PairSet cardDeck = new PairSet(4, 13);
			boolean win = true; 
			while (cardDeck.more() && win) {
				for (int w = 0; w < 3; w++) {
					Pair p = cardDeck.pick();
					if (false == cardDeck.more()) {
						wins++;
						break;
					}
				//	while (p == null) {
					//	p = cardDeck.pick();
					//}
					q = p.second();
				
				if (w == q) {
					win = false;
					break;
				}
				
			}}

		}

		double p = (double) wins / NBR_ITERATIONS;
		// sannolikheten för vinst

		System.out.println("Sannolikheten för att patiensen ska gå ut: " + p);
	}
}