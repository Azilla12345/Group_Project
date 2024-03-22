import java.util.Scanner;

public class Puzzle {
    int puzzleType;
    String answer;
    Prisoner prisoner;
    Scanner myScanner = new Scanner(System.in);

    public Puzzle(int type) {
        puzzleType = type;
        if (type == 1) {
            puzzle1("");
        }

    }

    public String move (String answer) {
        return answer;
    }
    public void puzzle1 (String answer) {
        System.out.println("What is your next move?");
        boolean chosen = false;
        int attempts = 0;
        if (answer.equals(this.answer)) {
            System.out.println("Correct!");
        } else {
            attempts++;
        }
    }


}
