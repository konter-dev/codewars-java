/**
 * (8 kyu) You Can't Code Under Pressure #1
 * https://www.codewars.com/kata/53ee5429ba190077850011d4
 * Code as fast as you can! You need to double the integer and return it.
 */

// 1. Simple solution
class Java {
    public static int doubleInteger(int i) {
        return 2 * i;
    }
}

// 2. Optimized solution
class Java {
    public static int doubleInteger(int i) {
        return i + i;
    }
}

// 3. Clever solution
class Java {
    public static int doubleInteger(int i) {
        return i << 1;
    }
}
