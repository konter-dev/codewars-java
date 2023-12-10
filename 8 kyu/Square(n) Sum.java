/**
 * (8 kyu) Square(n) Sum
 * https://www.codewars.com/kata/515e271a311df0350d00000f/
 *
 * Complete the square sum function so that it squares each number passed into
 * it and then sums the results together.
 *
 * For example, for [1, 2, 2] it should return 9 because 1^2+2^2+2^2 = 9.
 */
// 1. Simple solution
public class Kata {
    public static int squareSum(int[] n) {
        int sum = 0;
        for (int i = 0; i < n.length; i++) {
            sum += n[i] * n[i];
        }
        return sum;
    }
}

// 2. Optimized solution
public class Kata {
    public static int squareSum(int[] n) {
        int sum = 0;
        for (int i : n) {
            sum += Math.pow(i, 2);
        }
        return sum;
    }
}

// 3. Clever solution
import java.util.Arrays;

public class Kata {
    public static int squareSum(int[] n) {
        return Arrays.stream(n).map(i -> i * i).sum();
    }
}

// 4. Coding golf
public class Kata {
    public static int squareSum(int[] n) {
        return n.length == 0 ? 0 : n[0] * n[0] + squareSum(java.util.Arrays.copyOfRange(n, 1, n.length));
    }
}
