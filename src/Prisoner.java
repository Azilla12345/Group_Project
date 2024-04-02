public class Prisoner {
    Riddles riddle = new Riddles();
    public Prisoner() {
        riddle.getRiddle();

    }

    String answer;
    String item;

    public String question(String response) {
        if (response == answer) {
            return item;
        }
        return "screw you";
    }
}
