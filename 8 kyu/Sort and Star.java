/**
 * (8 kyu) Sort and Star
 * https://www.codewars.com/kata/57cfdf34902f6ba3d300001e/
 *
 * You will be given a list of strings. You must sort it alphabetically
 * (case-sensitive, and based on the ASCII values of the chars) and then return
 * the first value.
 *
 * The returned value must be a string, and have "***" between each of its
 * letters.
 *
 * You should not remove or add elements from/to the array.
 */
// 1. Simple solution
public class SortAndStar {
    public static String twoSort(String[] s) {
        String result = "";
        for (int i = 0; i < s.length - 1; i++) {
            for (int j = i + 1; j < s.length; j++) {
                if (s[i].compareTo(s[j]) > 0) {
                    String temp = s[i];
                    s[i] = s[j];
                    s[j] = temp;
                }
            }
        }
        String word = s[0];
        for (int i = 0; i < word.length() - 1; i++) {
            result += word.charAt(i) + "***";
        }
        return result + word.charAt(word.length() - 1);
    }
}

// 2. Optimized solution
public class SortAndStar {
    public static String twoSort(String[] s) {
        StringBuilder result = new StringBuilder();
        for (int i = 0; i < s.length - 1; i++) {
            for (int j = i + 1; j < s.length; j++) {
                if (s[i].compareTo(s[j]) > 0) {
                    String temp = s[i];
                    s[i] = s[j];
                    s[j] = temp;
                }
            }
        }
        String word = s[0];
        for (int i = 0; i < word.length() - 1; i++) {
            result.append(word.charAt(i)).append("***");
        }
        return result.toString() + word.charAt(word.length() - 1);
    }
}

// 3. Clever solution
public class SortAndStar {
    public static String twoSort(String[] s) {
        java.util.Arrays.sort(s);
        return String.join("***", s[0].split(""));
    }
}
