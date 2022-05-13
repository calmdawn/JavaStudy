package sub_4_1customer_test;

public class Customer {
    private int customerID;
    protected String name;
    int bonusPoint;
    protected String customerGrade;

    public Customer(int customerID, String name) {
        this.customerID = customerID;
        this.name = name;
        this.bonusPoint = 0;
        this.customerGrade = "Silver";
    }

    public String showCustomerInfo() {
        return name + "님의 등급은 " + customerGrade + "이며, " + "보너스 포인트는 " + bonusPoint + "입니다";
    }

    public int calcPrice(int price) {
        bonusPoint = (int) (bonusPoint + price * 0.01);
        return price;
    }

    public void pay(int price){
        bonusPoint = (int) (bonusPoint + price * 0.01);
        System.out.println(name + " 님이 " + price + "원 지불하셨습니다.");
    }

    public void showBonusPoint(){
        System.out.println(name + " 님의 현재 보너스 포인트는 " + bonusPoint + "점입니다.");
    }
}
