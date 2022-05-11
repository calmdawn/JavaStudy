package sub3_2company_test;

public class Company {
    /**
     * 늦은 초기화
     */
    private static Company company = null;

    private Company() {
    }

    public static Company getInstance() {
        if (company == null)
            company = new Company();
        return company;
    }
}

class CompanyEarly {
    /**
     * 이른 초기화
     */
    private static CompanyEarly companyEarly = new CompanyEarly();


    private CompanyEarly() {
    }

    public static CompanyEarly getInstance() {
        return companyEarly;
    }
}

class CompanyLazyHolder {
    /**
     * 늦은 초기화 + Thread Safe 보장
     */
    private CompanyLazyHolder() {

    }

    public static CompanyLazyHolder getInstance() {
        return Holder.instance;
    }

    private static class Holder {
        private static final CompanyLazyHolder instance = new CompanyLazyHolder();
    }


}