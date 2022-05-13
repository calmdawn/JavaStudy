package sub_4_1customer_test;

public class GoldCustomer extends Customer{

    public GoldCustomer(int customerID, String name) {
        super(customerID, name);
        this.customerGrade = "GOLD";
    }

    @Override
    public int calcPrice(int price) {
        bonusPoint = (int) (bonusPoint + price * 0.02);
        return (int) (price * 0.9);
    }

    @Override
    public void pay(int price) {
        bonusPoint = (int) (bonusPoint + price * 0.02);
        System.out.println(name + " 님이 " + (int)(price * 0.9) + "원 지불하셨습니다.");
    }
}
