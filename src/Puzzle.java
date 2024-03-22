public class Puzzle {
    int puzzleType;
    String answer;
    Prisoner prisoner;

    int attempts;


    public Puzzle(int type) {
        puzzleType = type;
        if (type == 1) {
            puzzle1("");
        }
        attempts = 0;
    }

    public void puzzle1 (String answer) {
        if (answer.equals(this.answer)) {
            System.out.println("Correct!");
        } else {
            attempts++;
        }
    }


}
