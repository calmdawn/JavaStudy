package sub2_print_taketrans;

public class Student {
    private final String name;
    private int money;

    public Student(String name, int money) {
        this.name = name;
        this.money = money;
    }

    public String getName() {
        return name;
    }

    public int getMoney() {
        return money;
    }

    public void setMoney(int money) {
        this.money = money;
    }

    public void takeBus(Bus bus100) {
        money = money - 1000;
        bus100.setCost(bus100.getCost() + 1000);
        bus100.setPassengerCnt(bus100.getPassengerCnt() + 1);
    }

    public void takeSubway(Subway subwayGreen) {
        money = money - 1200;
        subwayGreen.setCost(subwayGreen.getCost() + 1200);
    }

    public void showInfo() {
        System.out.println(name + "님의 남은 돈은 " + money + "원 입니다.");
    }
}
