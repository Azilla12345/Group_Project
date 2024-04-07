public class Prisoner {
    String question;
    String answer;
    String item;

    public Prisoner() {
        item = "gunpowder";
    }


    public String question(String response) {
        if (response.equals(answer)) {
            return item;
        }
        return "screw you";
    }
}
