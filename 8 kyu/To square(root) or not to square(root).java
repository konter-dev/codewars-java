/**
 * To square(root) or not to square(root)
 * https://www.codewars.com/kata/57f6ad55cca6e045d2000627
 *
 * Write a method, that will get an integer array as
 * parameter and will process every number from this
 * array.
 * Return a new array with processing every number of
 * the input-array like this:
 * If the number has an integer square root, take this,
 * otherwise square the number.
 *
 * Example
 * [4,3,9,7,2,1] -> [2,9,3,49,4,1]
 *
 * Notes
 * The input array will always contain only positive
 * numbers, and will never be empty or null.
 */
// 1. Simple solution
public class Kata {
    public static int[] squareOrSquareRoot(int[] array) {
        int[] res = new int[array.length];

        for (var i = 0; i < array.length; i++) {
            var squaredNumber = Math.sqrt(array[i]);
            if (squaredNumber == (int) squaredNumber) {
                res[i] = (int) squaredNumber;
            } else {
                res[i] = (int) Math.pow(array[i], 2);
            }
        }

        return res;
    }
}

// 2. Optimized solution
public class Kata {
    public static int[] squareOrSquareRoot(int[] array) {
        int[] res = new int[array.length];

        for (var i = 0; i < array.length; i++) {
            var squaredNumber = Math.sqrt(array[i]);
            res[i] = squaredNumber == (int) squaredNumber ? (int) squaredNumber : (int) Math.pow(array[i], 2);
        }

        return res;
    }
}

// 3. Clever solution
import java.util.Arrays;
public class Kata {
    public static int[] squareOrSquareRoot(int[] array) {
        return Arrays.stream(array).map(i -> Math.sqrt(i) % 1 == 0 ? (int) Math.sqrt(i) : i * i).toArray();
    }
}

// 4. Coding golf
public class Kata {
    public static int[] squareOrSquareRoot(int[] array) {
        return java.util.Arrays.stream(array).map(i -> Math.sqrt(i) % 1 == 0 ? (int) Math.sqrt(i) : i * i).toArray();
    }
}