package admin;

import java.util.ArrayList;

import Client.User;
import paying.transaction;

public class ReqARefund implements Subject {
	
	private ArrayList<Observer> observers = new ArrayList<Observer>();
	private String UserID;
	private transaction trans;
	private String ReqId;
	
	
	
	public String getUserID() {
		return UserID;
	}
	
	public transaction getTrans() {
		return trans;
	}
	public void setTrans(transaction trans) {
		this.trans = trans;
	}
	public ReqARefund(String UserID, transaction trans) {
		
		this.UserID = UserID;
		this.trans = trans;
		this.ReqId=UserID+trans.getTransId();
	}
	public String getReqId() {
		return ReqId;
	}

	public void setReqId(String reqId) {
		ReqId = reqId;
	}

	@Override
	public void Subscrib(Observer O) {
		
		observers.add(O);
	}
	@Override
	public void UnSubscrib(Observer O) {
		// TODO Auto-generated method stub
		
	}
	@Override
	public void NotifyAll() {
		for(Observer O:this.observers) {
			O.update(this);
		}
		
	}
	
	
	
	
	
}
