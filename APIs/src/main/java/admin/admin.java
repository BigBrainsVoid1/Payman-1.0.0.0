package admin;

import java.util.ArrayList;

import Client.database;
import paying.transaction;

public class admin  implements Observer {
	
	ArrayList<ReqARefund> reqs=new ArrayList<ReqARefund>();

	@Override
	public void update(ReqARefund r) {
		reqs.add(r);
		
	}
	
	public ArrayList<ReqARefund> GetReqs(){
		return this.reqs;
	}
	
	
	public double returnMonyBack(String ReqId,database data) {
		for(ReqARefund rr:this.reqs) {
			if(rr.getReqId().equals(ReqId)) {
				rr.getTrans().Refund();
				transaction newtrans=new transaction(rr.getTrans().getComp(),rr.getTrans().getUser(),rr.getTrans().getFee());
				data.addtansaction(newtrans);
				return rr.getTrans().getFee();
			}
		}
		return 0;
		
	}
	
	

}
