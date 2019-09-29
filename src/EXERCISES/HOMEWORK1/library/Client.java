package EXERCISES.HOMEWORK1.library;

public class Client {

    public final String firstName;
    public final String lastName;

    private final Item[] rentItems = new Item[3];

    public Client(String firstName, String lastName) {
        this.firstName = firstName;
        this.lastName = lastName;
    }

    public boolean rentItem(Item item) {
        if (numberOfCurrentRentItems() == rentItems.length) {
            return false;
        } else {
            int slot = freeSlot();
            rentItems[slot] = item;
            return true;
        }
    }

    public boolean leaveItem(Item item) {
        for (int i = 0; i < rentItems.length; i++) {
            if (rentItems[i] == item) {
                rentItems[i] = null;
                return true;
            }
        }
        return false;
    }

    public int numberOfCurrentRentItems() {
        int result = 0;
        for (int i = 0; i < rentItems.length; i++) {
            if (rentItems[i] != null) {
                result++;
            }
        }
        return result;
    }

    private int freeSlot() {
        int slot = 0;
        while(rentItems[slot] != null) {
            slot++;
        }
        return slot;
    }

}
