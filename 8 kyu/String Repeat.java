/**
 * Write a function that accepts an integer n and a string s as parameters, and returns a string of s repeated exactly n times.
 *
 * Examples (input -> output)
 * 6, "I"     -> "IIIIII"
 * 5, "Hello" -> "HelloHelloHelloHelloHello"
 */
// 1. Simple solution
public class Solution {
  public static String repeatStr(final int repeat, final String string) {
    var result = "";

    for (int i = 0; i < repeat; i++) {
      result += string;
    }

    return result;
  }
}

// 2. Optimized solution
public class Solution {
  public static String repeatStr(final int repeat, final String string) {
    var result = new StringBuilder(repeat);

    for (int i = 0; i < repeat; i++) {
      result.append(string);
    }

    return result.toString();
  }
}

// 3. Clever solution
public class Solution {
  public static String repeatStr(final int repeat, final String string) {
    return string.repeat(repeat);
  }
}

// 4. Coding golf
public class Solution {
  public static String repeatStr(final int r, final String s) {
    return s.repeat(r);
  }
}
