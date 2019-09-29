package EXERCISES.HOMEWORK1.task4;

public class Queue {

    private final Message[] t;

    private int newItemPos = 0;
    private int getItemPos = 0;

    public Queue(int initSize) {
        this.t = new Message[initSize];
    }

    /**
     * add item after last current item;
     */
    public boolean addItem(Message m) {
        if (t[newItemPos] == null) {
            t[newItemPos++] = m;
            // when we reached last item then reset pos to 0
            if (newItemPos == t.length) {
                newItemPos = 0;
            }
            return true;
        } else {
            return false;
        }
    }

    public Message getItem() {
        if (t[getItemPos] == null) {
            return null;
        }
        Message r = t[getItemPos];
        t[getItemPos++] = null;
        if (getItemPos == t.length) {
            getItemPos = 0;
        }
        return r;
    }
}
