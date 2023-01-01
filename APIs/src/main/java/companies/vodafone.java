package companies;

public class vodafone extends VerifiedCompanies {

	public vodafone(String compid, AccCredentials compaccount) {
		super(compid, compaccount);
		// TODO Auto-generated constructor stub
	}
	public vodafone() {
		
		
	}
	
	public void payinternet(double mount) {
		// TODO Auto-generated method stub
		double currentbalance=this.getCompaccount().getAccbalance();
		this.getCompaccount().setAccbalance(currentbalance+mount);
		
	}

}
