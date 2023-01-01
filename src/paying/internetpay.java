package paying;

public class internetpay  implements Iservice{

	@Override
	public void paying(transaction t) {
		// TODO Auto-generated method stub
		t.transactions();
		System.out.println("Payment Processing is Done :  ");
		
	}

}
