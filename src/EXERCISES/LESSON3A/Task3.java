package EXERCISES.LESSON3A;

import java.util.ArrayList;
import java.util.List;

public class Task3 {

    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();
        list.add(1);
        list.add(3);
        list.add(5);
        list.add(6);
        list.remove(Integer.valueOf(5));
        list.remove(new Integer(5));
    }
}
