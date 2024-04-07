public class Prison {

    String[] schedule = new String[5];
    int guards;
    int day;

    public Prison(int day) {
        this.day = day;
        schedule[0] = "Breakfast";
        schedule[1] = "work";
        schedule[2] = "Lunch";
        schedule[3] = "Free Time";
        schedule[4] = "Dinner";
    }

    public String getSchedule(int moment) {
        return schedule[moment];
    }


}
