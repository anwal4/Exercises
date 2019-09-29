package EXERCISES.HOMEWORK1.task3;

public class SubTask3 {
    public static void main(String[] args) {

        Student[] s = new Student[10];

        s[0] = new Student(Sex.F, 10);
        s[1] = new Student(Sex.M, 14);
        s[2] = new Student(Sex.F, 11);
        s[4] = new Student(Sex.M, 13);
        s[6] = new Student(Sex.F, 9);
        s[9] = new Student(Sex.M, 12);

        System.out.println(avg(s, Sex.F));
        System.out.println(avg(s, Sex.M));
    }

    static double avg(Student[] t, Sex s) {
        int sum = 0;
        int number = 0;
        for (int i = 0; i < t.length; i++) {
            if (t[i] != null && t[i].s == s) {
                sum += t[i].age;
                number++;
            }
        }
        if (number==0) {
            return 0;
        }
        return sum/(double)number;
    }
}

class Student {

    final Sex s;
    final int age;

    Student(Sex s, int age) {
        this.s = s;
        this.age = age;
    }
}
enum Sex {
    F,
    M;
}
