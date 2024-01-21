/**
 * (8 kyu) Reversed Words
 * https://www.codewars.com/kata/51c8991dee245d7ddf00000e/
 * 
 * Complete the solution so that it reverses all of the words within the string
 * passed in.
 * 
 * Words are separated by exactly one space and there are no leading or trailing.
 * 
 * Example (Input --> Output):
 * 
 * "The greatest victory is that which requires no battle" -->
 * "battle no requires which that is victory greatest The"
 */

// 1. Simple solution
public class ReverseWords {
    public static String reverseWords(String str) {
        String[] words = str.split(" ");
        String reversedString = "";
        for (int i = words.length - 1; i >= 0; i--) {
            reversedString += words[i] + " ";
        }
        return reversedString.trim();
    }
}

// 2. Optimized solution
public class ReverseWords {
    public static String reverseWords(String str) {
        StringBuilder reversedString = new StringBuilder();
        for (String word : str.split(" ")) {
            reversedString.insert(0, word + " ");
        }
        return reversedString.toString().trim();
    }
}

// 3. Clever solution
import java.util.*;

public class ReverseWords {
    public static String reverseWords(String str) {
        List<String> words = Arrays.asList(str.split(" "));
        Collections.reverse(words);
        return String.join(" ", words);
    }
}

// 4. Coding golf
import org.apache.commons.lang3.StringUtils;

public class ReverseWords {
    public static String reverseWords(String str) {
        return StringUtils.reverseDelimited(str, ' ');
    }
}
