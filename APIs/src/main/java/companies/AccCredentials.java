package companies;

public class AccCredentials {
	private String accid;
	private double accbalance;
	
	
	
	public AccCredentials(String accid, double accbalance) {
		this.accid = accid;
		this.accbalance = accbalance;
	}
	
	public String getAccid() {
		return accid;
	}
	
	
	public void setAccid(String accid) {
		this.accid = accid;
	}
	
	
	public double getAccbalance() {
		return accbalance;
	}
	
	
	public void setAccbalance(double accbalance) {
		this.accbalance = accbalance;
	}
	
	public void add(double m) {
		this.accbalance+=m;
	}

}
