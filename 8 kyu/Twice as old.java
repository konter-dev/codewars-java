/**
 * (8 kyu) Twice as old
 * https://www.codewars.com/kata/5b853229cfde412a470000d0/
 *
 * Your function takes two arguments:
 *
 * 1. current father's age (years)
 * 2. current age of his son (years)
 *
 * Сalculate how many years ago the father was twice as old as his son (or
 * in how many years he will be twice as old). The answer is always greater
 * or equal to 0, no matter if it was in the past or it is in the future.
 */
// 1. Simple solution
public class TwiceAsOld {
  public static int TwiceAsOld(int dadYears, int sonYears) {
    int twiceAsOld = dadYears - sonYears * 2;
    return twiceAsOld < 0 ? -twiceAsOld : twiceAsOld;
  }
}

// 2. Optimized solution
public class TwiceAsOld {
  public static int TwiceAsOld(int dadYears, int sonYears) {
    return Math.abs(dadYears - sonYears * 2);
  }
}

// 3. Coding golf
public class TwiceAsOld {
  public static int TwiceAsOld(int d, int s) {
    return abs(d-s-s);
  }
}