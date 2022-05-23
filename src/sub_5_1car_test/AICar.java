package sub_5_1car_test;

public class AICar extends Car {
    @Override
    void startCar() {
        System.out.println("시동을 켭니다.");
    }

    @Override
    void drive() {
        System.out.println("자율 주행합니다.");
    }

    @Override
    void turnOff() {
        System.out.println("자동차가 스스로 방향을 전환합니다.");
    }

    @Override
    void stop() {
        System.out.println("스스로 멈춥니다.");
        System.out.println("시동을 끕니다.");
    }

    @Override
    void run() {
        startCar();
        drive();
        turnOff();
        wiper();
        stop();
    }

    @Override
    void wiper() {
        System.out.println("비나 눈의 양에 따라 빠르기가 자동으로 조절됩니다.");
    }
}
