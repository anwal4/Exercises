package EXERCISES.LESSON2A.zoo;

public class ShowCat extends Cat implements ShowAnimal{
    protected ShowCat(String Name) {
        super(Name);
    }

    @Override
    public void showPose() {
        System.out.println("Cat pose");


    }
}
