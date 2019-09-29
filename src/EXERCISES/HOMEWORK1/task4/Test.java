package EXERCISES.HOMEWORK1.task4;

public class Test {
    public static void main(String[] args) {
        Queue q = new Queue(3);

        q.addItem(new Message("1"));
        q.addItem(new Message("2"));
        q.addItem(new Message("3"));

        System.out.println(q.getItem());
        System.out.println(q.getItem());
        System.out.println(q.getItem());
        System.out.println(q.getItem());

        q.addItem(new Message("4"));
        q.addItem(new Message("5"));
        q.addItem(new Message("6"));
        q.addItem(new Message("7"));

        System.out.println(q.getItem());
        System.out.println(q.getItem());
        System.out.println(q.getItem());
        System.out.println(q.getItem());
    }
}
