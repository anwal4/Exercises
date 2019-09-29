package EXERCISES.LESSON2A.zoo;

public class PetOwner {
    public  void play (Pet pet) {
       pet.speak();
       if (pet instanceof ShowAnimal){
           ShowAnimal a = (ShowAnimal) pet;
           a.showPose();
       }
    }
}
