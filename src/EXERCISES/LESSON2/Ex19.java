package EXERCISES.LESSON2;

public class Ex19 {
    public static void main(String[] args) {
        Worker.showWorkersDetails();
        Worker w = new Worker("Jan 1");
        Worker w2 = new Worker("Jan 2");
        Worker w3 = new Worker("Jan 3");
        Worker w4 = new Worker("Jan 4");
        Worker w5 = new Worker("Jan 5");
        w.showWorkersDetails();
        w.showDetails();
        System.out.println(Worker.counter);
    }
}

class Worker {

    static int counter;

    private String name;

    Worker(String name) {
        this.name = name;
        counter++;
    }

    void showDetails() {
        System.out.println("Razem ze mna pracuje " + (counter - 1) + " ludzi.");
    }

    static void showWorkersDetails() {
        System.out.println("Lacznie pracuje " + counter + " ludzi");
    }
}
