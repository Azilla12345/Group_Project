public class Player {
    int keys;
    String [] inventory;

    public Player() {
        keys = 0;
        inventory = new String[7];
        inventory[0] = "empty";
        inventory[1] = "empty";
        inventory[2] = "empty";
        inventory[3] = "empty";
        inventory[4] = "empty";
        inventory[5] = "empty";
        inventory[6] = "empty";
    }


    public void add(String item) {
        for (int i = 0; i < inventory.length; i++) {
            if (inventory[i].equals("empty")) {
                inventory[i] = item;
                break;
            }
        }
    }

    public String[] getInventory() {
        return inventory;
    }



}
