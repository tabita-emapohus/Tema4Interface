
public class MilitaryProject extends Project {

	private String deadline;
    private String password;

    public MilitaryProject(String title, String objective, long funds, Manager manager, String deadline, String password) {
        super(title, objective, funds, manager);
        this.deadline = deadline;
        this.password = password;
    }

    public String getDeadline() {
        return deadline;
    }

    public String getPassword() {
        return password;
    }

    @Override
    public double getRisk() {
        int numberOfMembers = getMembers().size();
        return (numberOfMembers * 1.0) / password.length() / getFunds();
    }
}
