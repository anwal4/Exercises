package EXERCISES.LESSON2A.zoo;

public class Dog extends Pet{
    protected Dog(String Name) {
        super(Name);
    }

    @Override
    public void speak() {                       //nadmisane metody "speak" z klasy Pet
        System.out.println("Hau hau");

    }
}
