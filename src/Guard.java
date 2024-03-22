public class Guard {
    boolean hasKey;
    int health;
    String item;

    public Guard(boolean special) {
        if (special) {
            health = 20;
            hasKey = true;
            item = "key";
        } else {
            health = 10;
            hasKey = false;
            item = "";
        }
    }

    public boolean isHasKey() {
        return hasKey;
    }

    public String stolen() {
        if (!hasKey) {
            System.out.println("This guard doesn't have a key!");
        }
        return item;
    }

}
