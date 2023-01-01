package paying;

public class EtisalatEGY extends Company_Template {

	
	
	
	public EtisalatEGY() {
		
	}
	
	
	
	
	public EtisalatEGY(String compid, account compaccount) {
		super(compid, compaccount);
		// TODO Auto-generated constructor stub
	}

	
	public void payinternet( double mount) {
		// TODO Auto-generated method stub
		double currentbalance=this.getCompaccount().getBalance_Account();
		this.getCompaccount().setBalance_Account(currentbalance+mount);
		
	}

}

