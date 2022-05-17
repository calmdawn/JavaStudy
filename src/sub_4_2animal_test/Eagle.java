package sub_4_2animal_test;

public class Eagle extends Animal {

    @Override
    public void move(){
        System.out.println("독수리가 하늘을 날아갑니다");
    }

    public void act(){
        System.out.println("독수리가 날개를 쭉 펴고 멀리 날아갑니다.");
    }
}
