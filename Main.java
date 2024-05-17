
public class Main {

	public static void main(String[] args) {
		InvestmentCompany company = new InvestmentCompany();

        Manager manager1 = new Manager("Dana", 40);
        Manager manager2 = new Manager("Alex", 45);
        Manager manager3 = new Manager("Clara", 50);

        CommercialProject cp = new CommercialProject("Commercial Project", "Develop a product", 1000, manager1, "2024-05-17", 5000, 5);
        cp.addMember(new Member("Darius", 30));
        cp.addMember(new Member("Tabita", 35));

        MilitaryProject mp = new MilitaryProject("Military Project", "Secret operation", 2000, manager2, "2024-05-17", "securepassword");
        mp.addMember(new Member("Vlad", 40));
        mp.addMember(new Member("Robert", 45));

        OpenSourceProject osp = new OpenSourceProject("Open Source Project", "Develop open-source software", 5000, manager3, "mailinglist@tabita.com");
        osp.addMember(new Member("Darius", 25));
        osp.addMember(new Member("Andreea", 28));

        company.addProject(cp);
        company.addProject(mp);
        company.addProject(osp);

        Project bestProject = company.getBestInvestment();
        if (bestProject != null) {
            System.out.println("The best investment is: " + bestProject.getTitle());
        } else {
            System.out.println("No projects available.");
        }
    }

}
