package EXERCISES.LESSON3A;


import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.function.Function;

public class Test6 {
    public static void main(String[] args) {
        Set<Car> set = new HashSet<>();

        set.add(new Car("1"));
        set.add(new Car("2"));
        set.add(new Car("1"));

        System.out.println(set.size());

    }
}

class Car {

    final String number;

    Car(String number) {
        this.number = number;
    }

    @Override
    public int hashCode() {
        return number.hashCode();
    }

    @Override
    public boolean equals(Object obj) {
        if (obj instanceof Car) {
            Car car = (Car)obj;
            return this.number.equals(car.number);
        }
        return false;
    }
}
