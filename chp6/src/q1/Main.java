package q1;

interface GovernmentPolicy {
    void followSafetyGuidelines();
    void payTaxes();
}

class CompanyA implements GovernmentPolicy {
    public void followSafetyGuidelines() {
        System.out.println("CompanyA: Implementing fire safety and employee health checkups.");
    }

    public void payTaxes() {
        System.out.println("CompanyA: Paying 18% corporate tax.");
    }
}

class CompanyB implements GovernmentPolicy {
    public void followSafetyGuidelines() {
        System.out.println("CompanyB: Providing workplace safety training and emergency exits.");
    }

    public void payTaxes() {
        System.out.println("CompanyB: Paying 20% corporate tax and filing annual reports.");
    }
}


public class Main {

	public static void main(String[] args) {
		GovernmentPolicy company1 = new CompanyA();
        company1.followSafetyGuidelines();
        company1.payTaxes();

        GovernmentPolicy company2 = new CompanyB();
        company2.followSafetyGuidelines();
        company2.payTaxes();

	}

}
