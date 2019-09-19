package EXERCISES.LESSON1A;

public class Break_in_loop {
    public static void main(String[] args) {
        PETLA_X:
        for (int i = 0; i < 10; i++) {
            PETLA_Y:
            for (int j = 0; j < 10; j++) {
                System.out.println(i + " " + j);
                if (j == 2) {
                    break PETLA_Y;//Można używać warunek continue lub break
                }
            }
        }

        System.out.println("\n");
        int x = 0;
        PETLA_X:
        while (x <= 10) {
            System.out.println(x++);
            if (x == 8) {
                break PETLA_X;
            }
        }
    }
}
