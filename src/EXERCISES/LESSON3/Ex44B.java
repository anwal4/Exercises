package EXERCISES.LESSON3;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Ex44B {

    public static void main(String[] args) {

        String path = "/Users/radoslawborowiecki/course/java-course/src/dev/borowiecki/presentation/Ex39.java";
        try(Scanner scanner = new Scanner(new File(path))) {
            while(scanner.hasNextLine()) {
                System.out.println(scanner.nextLine());
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }

    }
}
