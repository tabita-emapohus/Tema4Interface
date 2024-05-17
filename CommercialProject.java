
public class CommercialProject extends Project {

	private String deadline;
    private long marketingFunds;
    private int numberOfTeams;

    public CommercialProject(String title, String objective, long funds, Manager manager, String deadline, long marketingFunds, int numberOfTeams) {
        super(title, objective, funds, manager);
        this.deadline = deadline;
        this.marketingFunds = marketingFunds;
        this.numberOfTeams = numberOfTeams;
    }

    public String getDeadline() {
        return deadline;
    }

    public long getMarketingFunds() {
        return marketingFunds;
    }

    public int getNumberOfTeams() {
        return numberOfTeams;
    }

    @Override
    public double getRisk() {
        int numberOfMembers = getMembers().size();
        return (numberOfTeams * 3.0 / numberOfMembers) / (getFunds() - marketingFunds);
    }
}
