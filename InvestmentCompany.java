import java.util.ArrayList;

public class InvestmentCompany {

	private ArrayList<Project> projects;

    public InvestmentCompany() {
        this.projects = new ArrayList<>();
    }

    public void addProject(Project p) {
        projects.add(p);
    }

    public Project getBestInvestment() {
        if (projects.isEmpty()) {
            return null;
        }

        Project bestProject = projects.get(0);
        for (Project p : projects) {
            if (p.getRisk() < bestProject.getRisk()) {
                bestProject = p;
            }
        }
        return bestProject;
    }
}
