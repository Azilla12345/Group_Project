public class Prison {
    int guards;
    int floors;

    public Prison(int floors) {
        this.floors = floors;
        guards = (int)(Math.random() * 5) + 1;
    }


}
