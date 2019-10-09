package EXERCISES.LESSON3A;

import java.util.Comparator;
import java.util.Set;
import java.util.TreeSet;

public class Task4 {

    public static void main(String[] args) {
        Set<StudentResult> set = new TreeSet<>(new SumComparator());

        set.add(new StudentResult(3, 4));
        set.add(new StudentResult(4, 3));
        set.add(new StudentResult(3, 4));
        set.add(new StudentResult(3, 2));

        System.out.println(set);
    }
}

class SumComparator implements
        Comparator<StudentResult> {

    @Override
    public int compare(StudentResult o1, StudentResult o2) {
        return Integer.compare(o1.a + o1.b, o2.a + o2.b);
    }
}

class StudentResult implements
        Comparable<StudentResult> {

    final Integer a;
    final Integer b;

    StudentResult(Integer a, Integer b) {
        this.a = a;
        this.b = b;
    }

    @Override
    public int compareTo(StudentResult o) {
        if (a == o.a) {
            return Integer.compare(b, o.b);
        } else {
            return Integer.compare(a, o.a);
        }
    }

    @Override
    public String toString() {
        return "StudentResult(" + a + "," + b + ")";
    }
}