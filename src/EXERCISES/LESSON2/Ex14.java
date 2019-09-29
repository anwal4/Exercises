package EXERCISES.LESSON2;

public class Ex14 {

    public static void main(String[] args) {

        MyFirstClass o1 = new MyFirstClass();
        System.out.println(o1.hashCode());

        MyFirstClass o2 = new MyFirstClass();
        System.out.println(o2.hashCode());

        System.out.println(o1.equals(o2));

        System.out.println(o1.toString());
        System.out.println(o2.toString());



    }

}

class MyFirstClass {


}


