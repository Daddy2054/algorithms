/* *****************************************************************************
 *  Name:              Ada Lovelace
 *  Coursera User ID:  123456
 *  Last modified:     October 16, 1842
 **************************************************************************** */

import edu.princeton.cs.algs4.StdIn;
import edu.princeton.cs.algs4.StdOut;
import edu.princeton.cs.algs4.StdRandom;

public class RandomWord {
    public static void main(String[] args) {
        int x = 0;
        String result = "";
        String nextWord;
        while (!StdIn.isEmpty()) {
            nextWord = StdIn.readString();
            x++;
            if (StdRandom.bernoulli(1.0 / x)) {
                result = nextWord;
            }
        }
        StdOut.println(result);
    }
}
