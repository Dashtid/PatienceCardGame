package pair;

public class TestCardDeck {
	/**
	 * Program to test the methods in the PairSet class. Create a simulated deck,
	 * draw the cards, and check the counts.
	 */
	public static void main(String[] args) {
		PairSet cardDeck = new PairSet(4, 13);
		int[] suitVect = new int[4]; // Number of spades, hearts, etc.
		int[] rankVect = new int[13]; // Number of aces, twos, etc.

		System.out.println("Shuffled deck:");
		while (cardDeck.more()) {
			Pair p = cardDeck.pick();
			suitVect[p.first()]++;
			rankVect[p.second()]++;
			System.out.print(p + " ");
		}
		System.out.println();
		System.out.println();

		System.out.print("Number of cards in each suit: ");
		for (int i = 0; i < 4; i++) {
			System.out.print(suitVect[i] + " ");
		}
		System.out.println();

		System.out.print("Number of cards in each rank: ");
		for (int i = 0; i < 13; i++) {
			System.out.print(rankVect[i] + " ");
		}
		System.out.println();
	}
}
