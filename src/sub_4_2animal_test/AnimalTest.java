package sub_4_2animal_test;
import java.util.ArrayList;

public class AnimalTest {
    public static void main(String[] args){
//        Animal hAnimal = new Human();
//        Animal tAnimal = new Tiger();
//        Animal eAnimal = new Eagle();
//        AnimalTest test = new AnimalTest();
//        test.moveAnimal(hAnimal);
//        test.moveAnimal(tAnimal);
//        test.moveAnimal(eAnimal);
//        ArrayList<Animal> animalList = new ArrayList<Animal>();
//        animalList.add(hAnimal);
//        animalList.add(tAnimal);
//        animalList.add(eAnimal);
//        for(Animal animal : animalList) {
//            animal.move();
//        }

        /** 다운 캐스팅 */
        Animal hAnimal = new Human();
        Animal tAnimal = new Tiger();
        Animal eAnimal = new Eagle();
        ArrayList<Animal> animalList = new ArrayList<Animal>();
        animalList.add(hAnimal);
        animalList.add(tAnimal);
        animalList.add(eAnimal);
        AnimalTest test = new AnimalTest();
        test.testDownCasting(animalList);

    }

    private void testDownCasting(ArrayList<Animal> animalList) {
        for(Animal animal : animalList){
            if(animal instanceof Human){
                ((Human)animal).act();
            }else if(animal instanceof Tiger){
                ((Tiger) animal).act();
            }else if(animal instanceof Eagle){
                ((Eagle) animal).act();
            }
        }
    }

    private void moveAnimal(Animal animal) {
        animal.move();
    }
}
