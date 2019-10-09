package EXERCISES.LESSON3;

import java.util.Comparator;
import java.util.Map;
import java.util.Set;
import java.util.TreeSet;

public class Ex36D {
    public static void main(String[] args) {

        Comparator<String> stringComparator = new Comparator<String>() {
            @Override
            public int compare(String o1, String o2) {
                return -o1.toLowerCase().compareToIgnoreCase(o2.toLowerCase());
            }
        };

        Set<String> set = new TreeSet<>(stringComparator);
        set.add("dwa");
        set.add("DWA");
        set.add("cos");
        System.out.println(set);
    }
}
