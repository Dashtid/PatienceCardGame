package pair;

/** A pair of integers. */
public class Pair {
        private int a;
        private int b;

        /** Creates a new pair of integers. */
        public Pair(int a, int b) {
                this.a = a;
                this.b = b;
        }

        /** Returns the first value of the pair. */
        public int first() {
                return a;
        }

        /** Returns the second value of the pair. */
        public int second() {
                return b;
        }

        /** Returns a string describing the pair, e.g., "(5,3)". */
        public String toString() {
                return "(" + a + "," + b + ")";
        }
}
