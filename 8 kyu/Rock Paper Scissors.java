/**
 * (8 kyu) Rock Paper Scissors
 * https://www.codewars.com/kata/5672a98bdbdd995fad00000f/
 *
 * Let's play! You have to return which player won! In case of a draw return
 * Draw!.
 *
 * Examples(Input1, Input2 --> Output):
 *
 * "scissors", "paper" --> "Player 1 won!"
 * "scissors", "rock" --> "Player 2 won!"
 * "paper", "paper" --> "Draw!"
 */
// 1. Simple solution
public class Kata {
    public static String rps(String p1, String p2) {
        if (p1.equals(p2)) {
            return "Draw!";
        } else if (p1.equals("scissors") && p2.equals("paper")) {
            return "Player 1 won!";
        } else if (p1.equals("paper") && p2.equals("rock")) {
            return "Player 1 won!";
        } else if (p1.equals("rock") && p2.equals("scissors")) {
            return "Player 1 won!";
        } else {
            return "Player 2 won!";
        }
    }
}

// 2. Optimized solution
public class Kata {
    public static String rps(String p1, String p2) {
        if (p1.equals(p2)) {
            return "Draw!";
        } else if (p1.equals("scissors") && p2.equals("paper") || p1.equals("paper") && p2.equals("rock")
                || p1.equals("rock") && p2.equals("scissors")) {
            return "Player 1 won!";
        } else {
            return "Player 2 won!";
        }
    }
}

// 3. Clever solution
public class Kata {
    public static String rps(String p1, String p2) {
        if (p1.equals(p2))
            return "Draw!";
        return "Player "
                + ("scissorspaper paperrock rockscissors"
                        .contains(p1 + p2) ? 1 : 2)
                + " won!";
    }
}
