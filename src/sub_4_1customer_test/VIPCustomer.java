package sub_4_1customer_test;

public class VIPCustomer extends Customer{

    public VIPCustomer(int customerID, String name) {
        super(customerID, name);
        this.customerGrade = "VIP";
    }
}
