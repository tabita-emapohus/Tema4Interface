
public class OpenSourceProject extends Project {

	 private String mailingList;

	    public OpenSourceProject(String title, String objective, long funds, Manager manager, String mailingList) {
	        super(title, objective, funds, manager);
	        this.mailingList = mailingList;
	    }

	    public String getMailingList() {
	        return mailingList;
	    }

	    @Override
	    public double getRisk() {
	        int numberOfMembers = getMembers().size();
	        return (numberOfMembers * 1.0) / getFunds();
	    }
}
