package EXERCISES.HOMEWORK;

public class Ex1_Table_of_AZ {
    public static void main(String[] args) {
        String wynik = "";
        char litera = 64;
        for (int i = 0; i <= 25; i++){
            litera += 1;
            wynik += litera;
        }
    System.out.println(wynik);
    }
}
