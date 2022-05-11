package sub2_print_taketrans;

public class Bus {
    private final int number;
    private int passengerCnt;
    private int cost;

    public Bus(int number) {
        this.number = number;
    }

    public int getNumber() {
        return number;
    }

    public int getPassengerCnt() {
        return passengerCnt;
    }

    public void setPassengerCnt(int passengerCnt) {
        this.passengerCnt = passengerCnt;
    }

    public int getCost() {
        return cost;
    }

    public void setCost(int cost) {
        this.cost = cost;
    }

    public void showBusInfo() {
        System.out.println(number + "번 버스의 승객은 " + passengerCnt + "명 이고, 수입은 " + cost + "원 입니다.");
    }
}
