package paying;

public class VodafoneEGY extends Company_Template {

	public VodafoneEGY(String compid, account compaccount) {
		super(compid, compaccount);
		// TODO Auto-generated constructor stub
	}
	public VodafoneEGY() {
		
		
	}
	
	public void payinternet(double mount) {
		// TODO Auto-generated method stub
		double currentbalance=this.getCompaccount().getBalance_Account();
		this.getCompaccount().setBalance_Account(currentbalance+mount);
		
	}

}
