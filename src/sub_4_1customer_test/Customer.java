package sub_4_1customer_test;

public class Customer {
    private int customerID;
    private String name;
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
}
