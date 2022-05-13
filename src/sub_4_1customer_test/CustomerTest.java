package sub_4_1customer_test;

import java.util.ArrayList;

public class CustomerTest {
    public static void main(String[] args) {
//        Customer customerLee = new Customer(10010, "이순신");
//        customerLee.bonusPoint = 1000;
//        System.out.println(customerLee.showCustomerInfo());
//        VIPCustomer customerKim = new VIPCustomer(10020, "김유신");
//        customerKim.bonusPoint = 10000;
//        System.out.println(customerKim.showCustomerInfo());
//
//        int priceLee = customerLee.calcPrice(10000);
//        int priceKim = customerKim.calcPrice(10000);
//        System.out.println(customerLee.showCustomerInfo() + " 지불금액은 " + priceLee + "원 입니다.");
//        System.out.println(customerKim.showCustomerInfo() + " 지불금액은 " + priceKim + "원 입니다.");
//        Customer customerNo = new VIPCustomer(10030, "나몰라");
//        customerNo.bonusPoint = 10000;
//        int priceNo = customerNo.calcPrice(10000);
//        System.out.println(customerNo.showCustomerInfo() + " 지불금액은 " + priceNo + "원 입니다.");

        /**
         *  ArrayList 활용한 고객정보 출력
         * */

        ArrayList<Customer> customerArrayList = new ArrayList<>();
        customerArrayList.add(new Customer(10010, "이순신"));
        customerArrayList.add(new Customer(10020, "신사임당"));
        customerArrayList.add(new GoldCustomer(10030, "홍길동"));
        customerArrayList.add(new GoldCustomer(10040, "이율곡"));
        customerArrayList.add(new VIPCustomer(10050, "김유신"));

        System.out.println("====== 고객 정보 출력 ======");
        for(Customer customer : customerArrayList){
            System.out.println(customer.showCustomerInfo());
        }
        System.out.println("====== 할인율과 보너스 포인트 계산 ======");
        for(Customer customer : customerArrayList){
            customer.pay(10000);
            customer.showBonusPoint();
        }
    }
}
