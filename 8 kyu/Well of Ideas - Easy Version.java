/**
 * (8 kyu) Well of Ideas - Easy Version
 * https://www.codewars.com/kata/57f222ce69e09c3630000212/
 * 
 * For every good kata idea there seem to be quite a few bad ones!
 *
 * In this kata you need to check the provided array (x) for good ideas 'good' and bad ideas 'bad'. If there are one or two good ideas, return 'Publish!', if there are more than 2 return 'I smell a series!'. If there are no good ideas, as is often the case, return 'Fail!'.
 */
// 1. Simple solution
public class Kata {
    public static String well(String[] x) {
        var goodIdeas = 0;
        for (var idea : x) {
            if (idea.equals("good")) {
                goodIdeas += 1;
            }
            if (goodIdeas > 2) {
                return "I smell a series!";
            }
        }
        if (goodIdeas == 0) {
            return "Fail!";
        }
        return "Publish!";
    }
}

// 2. Optimized solution
import java.util.Arrays;
import java.util.Collections;

public class Kata {
    public static String well(String[] x) {
        switch (Collections.frequency(Arrays.asList(x), "good")) {
            case 1:
            case 2:
                return "Publish!";
            case 0:
                return "Fail!";
            default:
                return "I smell a series!";
        }
    }
}

// 3. Clever solution
import java.util.Arrays;

class Kata {
    static String well(String[] ideas) {
        var count = Arrays.stream(ideas).filter(i -> i.equals("good")).count();
        return count > 2 ? "I smell a series!" : count > 0 ? "Publish!" : "Fail!";
    }
}
