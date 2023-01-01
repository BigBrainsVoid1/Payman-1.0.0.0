package companies;

public abstract  class  VerifiedCompanies {

	private String compid;
	private AccCredentials compaccount;
	
	public VerifiedCompanies() {}
	
	
	public VerifiedCompanies(String compid, AccCredentials compaccount) {
		
		this.compid = compid;
		this.compaccount = compaccount;
	}
	
	
	
	
	public String getCompid() {
		return compid;
	}
	public void setCompid(String compid) {
		this.compid = compid;
	}
	public AccCredentials getCompaccount() {
		return compaccount;
	}
	public void setCompaccount(AccCredentials compaccount) {
		this.compaccount = compaccount;
	}
	
}
