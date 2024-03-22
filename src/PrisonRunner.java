import java.util.Scanner;

public class PrisonRunner {
    public void Start() {
        Scanner myScanner = new Scanner(System.in);
        System.out.println("You wake up in a ventilated prison cell, guarded by five guards.");
        System.out.println("As you grip your screwdriver and look around in confusion, you notice a mark on a calender.");
        System.out.println("The date February 11th is marked as your \"execution\"");
        System.out.println("Its now or never. Its time for you to escape or die trying.");
        Puzzle puzzle = new Puzzle(1);
    }
}
