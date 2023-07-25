/**
 * (8 kyu) Total amount of points
 * https://www.codewars.com/kata/5bb904724c47249b10000131/
 *
 * Our football team finished the championship.
 * Our team's match results are recorded in a collection of strings. Each match
 * is represented by a string in the format "x:y", where `x` is our team's score
 * and `y` is our opponents score.
 *
 * For example: ["3:1", "2:2", "0:1", ...]
 * Points are awarded for each match as follows:
 * - if x > y: 3 points (win)
 * - if x < y: 0 points (loss)
 * - if x = y: 1 point (tie)
 *
 * We need to write a function that takes this collection and returns the number
 * of points our team (x) got in the championship by the rules given above.
 *
 * Notes:
 * - our team always plays 10 matches in the championship
 * - 0 <= x <= 4
 * - 0 <= y <= 4
 */
// 1. Simple solution
public class TotalPoints {
    public static int points(String[] games) {
        int points = 0;
        for (String game : games) {
            int x = Integer.parseInt(game.substring(0, 1));
            int y = Integer.parseInt(game.substring(2, 3));
            if (x > y) {
                points += 3;
            } else if (x == y) {
                points += 1;
            }
        }
        return points;
    }
}

// 2. Optimized solution
public class TotalPoints {
    public static int points(String[] games) {
        int points = 0;
        for (String game : games) {
            int x = Integer.parseInt(game.substring(0, 1));
            int y = Integer.parseInt(game.substring(2, 3));
            points += x > y ? 3 : x == y ? 1 : 0;
        }
        return points;
    }
}

// 3. Clever solution
import java.util.Arrays;
public class TotalPoints {
    public static int points(String[] g) {
        return Arrays.stream(g).mapToInt(s -> s.charAt(0) - s.charAt(2)).map(m -> m > 0 ? 3 : m == 0 ? 1 : 0).sum();
    }
}
