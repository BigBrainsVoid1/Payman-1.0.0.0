package paying;

public class Recharging implements Iservice {

	// Your wallet's empty -----------> there u go
	@Override
	public void paying(transaction t) {
		// TODO Auto-generated method stub
		t.transactions();
		System.out.println("recharging done ");
	}
 
}
