package companies;

public class orange extends VerifiedCompanies{

	public orange(String compid, AccCredentials compaccount) {
		super(compid, compaccount);
		// TODO Auto-generated constructor stub
	}

	public void payinternet( double mount) {
		// TODO Auto-generated method stub
		double currentbalance=this.getCompaccount().getAccbalance();
		this.getCompaccount().setAccbalance(currentbalance+mount);
		
	}

}

