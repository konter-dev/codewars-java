/**
 * (8 kyu) What is between?
 * https://www.codewars.com/kata/55ecd718f46fba02e5000029
 *
 * Complete the function that takes two integers (a, b, where a < b) and return
 * an array of all integers between the input parameters, including them.
 *
 * For example:
 *
 * ```java
 * a = 1
 * b = 4
 * --> [1, 2, 3, 4]
 * ```
 */

// 1. Simple solution
public class Kata {

    public static int[] between(int a, int b) {
        int length = b - a + 1;
        int[] result = new int[length];

        for (int i = 0; i < length; i++) {
            result[i] = a + i;
        }

        return result;
    }
}

// 2. Optimized solution
public class Kata {

    public static int[] between(int a, int b) {
        int[] result = new int[b - a + 1];

        for (int i = 0; i < result.length; i++) {
            result[i] = a++;
        }

        return result;
    }
}

// 3. Clever solution
import java.util.stream.IntStream;

public class Kata {

    public static int[] between(int a, int b) {
        return IntStream.rangeClosed(a, b).toArray();
    }
}
