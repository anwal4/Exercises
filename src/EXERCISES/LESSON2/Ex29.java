package EXERCISES.LESSON2;

public class Ex29 {
    public static void main(String[] args) {
        Song s = new Song() {
            @Override
            public void play() {
                System.out.println("mmmmhhah");
            }
        };
        s.play();

    }

}


interface Song {

    void play();
}