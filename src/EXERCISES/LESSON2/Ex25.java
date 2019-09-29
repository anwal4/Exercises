package EXERCISES.LESSON2;

public class Ex25 {

}

interface Runner {
    void run(int m);
}

interface Thrower {
    void throwSth();
}

interface MarathonRunner {
    void run(int m);
}

class SportsMan implements Runner, Thrower, MarathonRunner {

    @Override
    public void run(int m) {
        System.out.println("SportsMan run" + m);
    }

    @Override
    public void throwSth() {

    }
}
