package EXERCISES.HOMEWORK1.library;

public class Test {
    public static void main(String[] args) {

        Client c1 = new Client("John", "Doe");
        System.out.println(c1.numberOfCurrentRentItems());

        Item b1 = new Book("1", "Harry Potter 1", "JK Rowling", 100, Cover.hardCover);
        Item b2 = new Book("2", "Harry Potter 2", "JK Rowling", 100, Cover.hardCover);
        Item b3 = new Book("3", "Harry Potter 3", "JK Rowling", 100, Cover.hardCover);
        Item b4 = new Book("4", "Harry Potter 4", "JK Rowling", 100, Cover.hardCover);

        c1.rentItem(b1);
        System.out.println(c1.numberOfCurrentRentItems());

        c1.rentItem(b2);
        System.out.println(c1.numberOfCurrentRentItems());

        c1.rentItem(b3);
        System.out.println(c1.numberOfCurrentRentItems());

        System.out.println(c1.rentItem(b4));
        System.out.println(c1.numberOfCurrentRentItems());

        System.out.println(c1.leaveItem(b4));
        System.out.println(c1.numberOfCurrentRentItems());

        System.out.println("leave item b3");
        System.out.println(c1.leaveItem(b3));
        System.out.println(c1.numberOfCurrentRentItems());


    }
}
