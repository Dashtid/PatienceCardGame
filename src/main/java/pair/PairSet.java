package pair;

import java.util.Random;

/**
 * Represents a set of all integer pairs (a, b) such that 0 <= a < rows and 0 <=
 * b < cols.
 */
public class PairSet {

	private int n;
	private final Pair[] pairs;
	private static final Random rand = new Random();

	/**
	 * Creates a set of all integer pairs (a, b) such that 0 <= a < rows and 0 <= b
	 * < cols.
	 */
	public PairSet(int rows, int cols) {
		n = rows * cols;
		pairs = new Pair[n];
		int pos = 0;
		for (int i = 0; i < rows; i++) {
			for (int k = 0; k < cols; k++) {
				pairs[pos++] = new Pair(i, k);
			}
		}
	}

	/** Returns true if there are more pairs in the set. */
	public boolean more() {
		return n > 0;
	}

	/**
	 * Picks a random pair from the set. The set becomes one element smaller.
	 * Returns null if the set is empty.
	 */
	public Pair pick() {
		if (n == 0) {
			return null;
		}
		int g = rand.nextInt(n);
		Pair p = pairs[g];
		pairs[g] = pairs[n - 1];
		pairs[n - 1] = null; // Help GC
		n--;
		return p;
	}

	/** Returns the number of pairs left in the set. */
	public int size() {
		return n;
	}
}
