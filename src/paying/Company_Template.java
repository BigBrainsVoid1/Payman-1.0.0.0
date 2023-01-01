package paying;

public abstract  class  Company_Template {

	private String compid;
	private account compaccount;
	
	public Company_Template() {}
	
	
	public Company_Template(String compid, account compaccount) {
		
		this.compid = compid;
		this.compaccount = compaccount;
	}
	
	
	
	
	public String getCompid() {
		return compid;
	}
	public void setCompid(String compid) {
		this.compid = compid;
	}
	public account getCompaccount() {
		return compaccount;
	}
	public void setCompaccount(account compaccount) {
		this.compaccount = compaccount;
	}
	
}
