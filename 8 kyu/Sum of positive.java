import java.util.Arrays;

/**
 * You get an array of numbers, return the sum of all of the positives ones.
 * Example [1,-4,7,12] => 1 + 7 + 12 = 20
 * Note: if there is nothing to sum, the sum is default to 0.
 */
// 1. Simple solution
public class Positive {
    public static int sum(int[] arr) {
        int res = 0;
        for (int i : arr)
            if (i > 0)
                res += i;

        return res;
    }
}

// 2. Optimized solution
public class Positive {
    public static int sum(int[] arr) {
        int res = 0;
        for (int i : arr) res += i > 0 ? i : 0;
        return res;
    }
}

// 3. Clever solution
public class Positive {
    public static int sum(int[] arr) {
        return Arrays.stream(arr).filter(i -> i > 0).reduce(0, Integer::sum);
    }
}

// 4. Coding golf
class Positive {
    static int sum(int[] a) {
        return Arrays.stream(a).filter(i -> i > 0).sum();
    }
}
