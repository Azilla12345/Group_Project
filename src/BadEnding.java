public class BadEnding extends Endings{
    public BadEnding() {
        String ending = "Bad end";
    }

    public void end() {
        super.end();
        System.out.println("Despite your best efforts, there is nothing you can do.");
        System.out.println("Your executed for a crime you didn't commit");
        System.out.println("Ending 1 out of 4");

    }

}
