package sub3_2company_test;

public class CompanyTest {
    public static void main(String[] args){
        Company myCompany1 = Company.getInstance();
        Company myCompany2 = Company.getInstance();
        //Company company = new Company(); // 오류
        System.out.println(myCompany1 + "   :   " + myCompany2);
        System.out.println( myCompany1 == myCompany2 );

    }
}
