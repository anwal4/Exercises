package EXERCISES.LESSON2A.zoo;

public class Cat extends Pet {
    protected Cat(String Name) {                //Konstruktor
        super(Name);                            //musi być super odwołanie
    }

    @Override
    public void speak() {                       //nadmisane metody "speak" z klasy Pet
        System.out.println("Miau Miau");

    }


}
