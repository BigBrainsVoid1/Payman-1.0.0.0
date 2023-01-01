package companies;

public class etisalat extends VerifiedCompanies {
	
	
	public etisalat() {
		
	}
	
	
	
	
	public etisalat(String compid, AccCredentials compaccount) {
		super(compid, compaccount);
		// TODO Auto-generated constructor stub
	}

	
	public void payinternet( double mount) {
		// TODO Auto-generated method stub
		double currentbalance=this.getCompaccount().getAccbalance();
		this.getCompaccount().setAccbalance(currentbalance+mount);
		
	}

}

