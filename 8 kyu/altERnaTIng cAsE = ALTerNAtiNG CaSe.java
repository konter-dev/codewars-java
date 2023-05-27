/**
 * (8 kyu) altERnaTIng cAsE = ALTerNAtiNG CaSe
 * http://www.codewars.com/kata/alternating-case-%3C-equals-%3E-alternating-case
 *
 * Define `String.prototype.toAlternatingCase` (or a similar function/method
 * *such as* `to_alternating_case`/`toAlternatingCase`/`ToAlternatingCase` in
 * your selected language; **see the initial solution for details**) such that
 * each lowercase letter becomes uppercase and each uppercase letter becomes
 * lowercase.
 *
 * For example:
 *
 * `"hello world".toAlternatingCase() === "HELLO WORLD"`
 */

// 1. Simple solution
public class StringUtils {
    public static String toAlternativeString(String string) {
        String result = "";
        for (int i = 0; i < string.length(); i++) {
            String c = Character.toString(string.charAt(i));
            if (c.toUpperCase() == c) {
                result += c.toLowerCase();
            } else {
                result += c.toUpperCase();
            }
        }
        return result;
    }
}

// 2. Optimized solution
public class StringUtils {
    public static String toAlternativeString(String string) {
        String result = "";
        for (char c : string.toCharArray()) {
            if (Character.isUpperCase(c)) {
                result.append(Character.toLowerCase(c));
            } else {
                result.append(Character.toUpperCase(c));
            }
        }
        return result.toString();
    }
}

// 3. Clever solution
public class StringUtils {
    public static String toAlternativeString(String string) {
        return string.chars()
                .map(c -> Character.isUpperCase(c) ? Character.toLowerCase(c) : Character.toUpperCase(c))
                .collect(StringBuilder::new, StringBuilder::appendCodePoint, StringBuilder::append)
                .toString();
    }
}