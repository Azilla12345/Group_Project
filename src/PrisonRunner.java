import java.util.Arrays;
import java.util.Scanner;

public class PrisonRunner {
    public void Start() {
        Scanner myScanner = new Scanner(System.in);

        Player player = new Player();
        int day = 1;
        int schedule = 0;
        Riddles riddle = new Riddles();
        while (day != 8) {
            System.out.println("You wake up in your ventilated prison cell, guarded by the same five guards.");
            try{
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                System.out.println("Error!");
            }
            System.out.println("You notice a mark on a calender.");
            try{
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                System.out.println("Error!");
            }
            System.out.println("The date is March " + day);
            try{
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                System.out.println("Error!");
            }
            System.out.println(8-day + " days.  That's all the time you have left");
            try{
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                System.out.println("Error!");
            }
            System.out.println("In the corner of the room, you see a prisoner.");
            try{
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                System.out.println("Error!");
            }
            System.out.println("Maybe he has what you need");
            try{
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                System.out.println("Error!");
            }
            System.out.println("Well, so you need parts, do you? Well, first you must answer my riddle!");
            riddle.setRiddle(day);
            String answer = myScanner.nextLine();
            player.add(riddle.getAnswer(answer));
            System.out.println("Time moves on, and your back in you cell");
            System.out.println("In your inventory, you have " + Arrays.toString(player.getInventory()));
            day++;
        }
    }
}
