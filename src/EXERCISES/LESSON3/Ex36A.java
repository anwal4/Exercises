package EXERCISES.LESSON3;

import java.util.Comparator;
import java.util.Set;
import java.util.TreeSet;

public class Ex36A {
    public static void main(String[] args) {
        Comparator<Integer> c = new Comparator<Integer>() {
            @Override
            public int compare(Integer o1, Integer o2) {
                return (o1 % 10) - (o2 % 10);
            }
        };
        Set<Integer> set = new TreeSet<>(c);
        set.add(1);
        set.add(2);
        set.add(11);
        System.out.println(set);

        ItStudent s1 = new ItStudent(1);
        ItStudent s2 = new ItStudent(2);
        ItStudent s1v2 = new ItStudent(1);

        Set<ItStudent> studentSet = new TreeSet<>();
        studentSet.add(s1);
        studentSet.add(s2);
        studentSet.add(s1v2);
        System.out.println(studentSet.size());

        Set<Dummy> dummySet = new TreeSet<>();

        dummySet.add(new Dummy());
        dummySet.add(new Dummy());
        dummySet.add(new Dummy());

    }
}

class Dummy {

}

class ItStudent implements Comparable<ItStudent> {

    final Long id;

    ItStudent(long id) {
        this.id = id;
    }

    @Override
    public int compareTo(ItStudent o) {
        return this.id.compareTo(o.id);
    }
}
