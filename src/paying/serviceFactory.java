package paying;

public class serviceFactory implements IserviceFactory  {

	@Override
	public Iservice chooseservice(char selector) {
		
		if (selector=='a') {
			return new Recharging();
		}
		if(selector=='b') {
			return new internetpay();
		}
		
		if (selector=='c') {
			return new landline();
		}
		
		return null;
	}
	
	

}
