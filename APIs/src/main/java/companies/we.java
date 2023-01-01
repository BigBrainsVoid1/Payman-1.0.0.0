package companies;

public class we extends VerifiedCompanies {

	
	public we() {}
	
	public we(String compid, AccCredentials compaccount) {
		super(compid, compaccount);
		// TODO Auto-generated constructor stub
	}

	public void payinternet(double mount) {
		// TODO Auto-generated method stub
		double currentbalance=this.getCompaccount().getAccbalance();
		this.getCompaccount().setAccbalance(currentbalance+mount);
		
		
	}

}
