package pair;

public class PairMain {

	private static final double NBR_ITERATIONS = 10000;

	public static void main(String[] args) {
		double wins = 0; // number of wins

		for (int i = 0; i < NBR_ITERATIONS; i++) {
			PairSet cardDeck = new PairSet(4, 13);
			boolean win = true;
			while (cardDeck.more() && win) {
				for (int w = 0; w < 3; w++) {
					Pair p = cardDeck.pick();
					if (p == null) {
						wins++;
						break;
					}
					if (w == p.second()) {
						win = false;
						break;
					}
				}
			}
		}

		double probability = wins / NBR_ITERATIONS;
		System.out.println("Probability that the patience succeeds: " + probability);
	}
}