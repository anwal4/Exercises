package EXERCISES.HOMEWORK1.task3;

public class SubTask1 {
    public static void main(String[] args) {
        int[] tab = {1, 2, 3, 4, 5, 6, 7, 8, 9};

        int evenSum = 0;
        int oddSum = 0;
        for (int i = 0; i < tab.length; i++) {
            if (i % 2 == 0) {
                evenSum += tab[i];
            } else {
                oddSum += tab[i];
            }
        }
        int sum = evenSum + oddSum;

        System.out.println("Sum: "  + sum);
        System.out.println("even sum: "  + evenSum);
        System.out.println("odd sum: "  + oddSum);
    }
}
