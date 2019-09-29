package EXERCISES.LESSON2A.zoo;

public class ShowDog extends Dog implements ShowAnimal{

    protected ShowDog(String Name) {
        super(Name);
    }

    @Override
    public void showPose() {
        System.out.println("Dog pose");


    }
}
