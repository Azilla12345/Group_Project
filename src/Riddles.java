public class Riddles {
    String[][] riddle = new String[10][10];
    public Riddles() {
        riddle[0][0] = "What has to be broken before you can use it?";
        riddle[0][1] = "An egg";
        riddle[1][0] = "I’m tall when I’m young, and I’m short when I’m old. What am I?";
        riddle[1][1] = "A candle";
        riddle[0][2] = "What question can you never answer yes to?";
        riddle[1][2] = "are you asleep?";

    }

    public String[][] getRiddle() {
        int choice = (int)(Math.random()*10);
        String[] list = new String[1];
        list[0] = riddle[0][choice];
        list[0] = riddle[choice][1];
        return new String[][]{list};
    }   
}
