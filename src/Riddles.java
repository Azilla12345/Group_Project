import java.util.Locale;

public class Riddles extends Prisoner {
    String item = "part";
    String[][] riddle = new String[2][7];
    public Riddles() {
        riddle[0][0] = "What has to be broken before you can use it?";
        riddle[1][0] = "an egg";
        riddle[0][1] = "I’m tall when I’m young, and I’m short when I’m old. What am I?";
        riddle[1][1] = "a candle";
        riddle[0][2] = "What question can you never answer yes to?";
        riddle[1][2] = "are you asleep?";
        riddle[0][3] = "What can you break, even if you never pick it up or touch it?";
        riddle[1][3] = "a promise";
        riddle[0][4] = "What goes up but never comes down?";
        riddle[1][4] = "age";
        riddle[0][5] = "I have branches, but no fruit, trunk or leaves. What am I?";
        riddle[1][5] = "a bank";
        riddle[0][6] = "The more of this there is, the less you see. What is it?";
        riddle[1][6] = "darkness";
    }
    String[] list = new String[2];
    public void setRiddle(int choice) {
        list[0] = riddle[0][choice -1];
        list[1] = riddle[1][choice -1];
        System.out.println(list[0]);
    }

    public String getAnswer(String answer) {
        answer = answer.toLowerCase();
        if (answer.equals(list[1])) {
            System.out.println("Correct, here have this item");
            return item;
        } else {
            System.out.println("ha, no. Go away now");
            return "empty";
        }
    }


}
