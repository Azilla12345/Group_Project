public class Player {
    int keys;
    String [][] inventory;

    public Player() {
        keys = 0;
        inventory = new String[6][6];
    }


    public void add(String item) {
        for (int i = 0; i < inventory.length; i++) {
            for (int j = 0; j < inventory[0].length; j++) {
                if (inventory[i][j].equals(null)) {
                    inventory[i][j] = item;
                    break;
                }
            }
        }
    }



}
