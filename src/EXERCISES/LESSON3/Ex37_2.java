package EXERCISES.LESSON3;

import java.util.Comparator;
import java.util.Map;
import java.util.TreeMap;

public class Ex37_2 {
    public static void main(String[] args) {
        Map<Student, Integer> mathMark = new TreeMap<>();

        mathMark.put(new Student("912312"), 2);
        mathMark.put(new Student("912312"), 3);
        mathMark.put(new Student("912313"), 4);

        System.out.println(mathMark);

        Comparator<String> comp = (s1, s2) -> s1.length() - s2.length();
    }

    static class Student implements Comparable<Student> {
        final String pesel;

        Student(String pesel) {
            this.pesel = pesel;
        }

        @Override
        public int compareTo(Student o) {
            return pesel.compareTo(o.pesel);
        }

        @Override
        public String toString() {
            return "Student("+pesel+")";
        }
    }

}

