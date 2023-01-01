package paying;

import java.util.ArrayList;
import java.util.Scanner;

public class main {

	public static void main(String[] args) {

		// Here we init the Database 
		// Giving Little data to be entered for us eto interact with
		// in the database later 
		ProviderDB data = new ProviderDB();

		account etsacc = new account("011ac", 14520);
		Company_Template ets = new EtisalatEGY("011", etsacc);

		data.addCompany(ets);
		data.addAcc(etsacc, ets);

		account vodacc = new account("010ac", 1424);
		Company_Template voda = new VodafoneEGY("010", vodacc);

		data.addCompany(voda);
		data.addAcc(vodacc, voda);

		account orangeacc = new account("012ac", 123457);
		Company_Template orange = new OrangeEGY("012", orangeacc);

		account weacc = new account("015ac", 5895);
		Company_Template we = new WeEGY("015", weacc);

		data.addCompany(we);
		data.addAcc(weacc, we);

		// System.out.println(ets.getCompaccount().getAccbalance());
		// the form of registration
		register registration = new register();

		// Init the form
		UserLogin loging = UserLogin.getinstance();

		System.out.println("wleocme do you want 1-login 2-register ");
		Scanner in = new Scanner(System.in);

		int a = in.nextInt();
		
		
		while (a!=0) {
			
			if (a == 1) {

				// User prompted data input 

				ArrayList<String> inputs = Input();

				loging.loginguser(inputs.get(0), inputs.get(1), data);

				char choice = ScreenService().charAt(0);
				serviceFactory servicefact = new serviceFactory();

				Iservice service = servicefact.chooseservice(choice);
				
				
				if ( choice =='a' || choice =='b') {
					

					String chosprovider = Screenprovider();

					if (chosprovider.equals("i")) {
						
						paying(service, voda, loging, data);
					}

					if (chosprovider.equals("ii")) {
						paying(service, ets, loging, data);

					}

					if (chosprovider.equals("iii")) {
						paying(service, orange, loging, data);

					}
					if (chosprovider.equals("iiii")) {
						paying(service, we, loging, data);

					}
					
				}
				else if (choice =='c') {
					System.out.println("enter the landline kind " );
					paying(service, we, loging, data);
					
				}
				
				
				

			}
			if (a == 2) {

				// getting the data for register

				ArrayList<String> inputs = Input();

				String em = inputs.get(0);
				String pass = inputs.get(1);

				if (registration.signup(em, pass, data) == 1) {

					loging.loginguser(em, pass, data);

					Online_Wallet w = creatingwallet();

					data.addwallet(w, loging.getCurrentuser());

					// data.showuserdataByEmail(em);

					char choice = ScreenService().charAt(0);
					serviceFactory servicefact = new serviceFactory();

					Iservice service = servicefact.chooseservice(choice);
					
					if ( choice =='a' || choice =='b') {
						

						String chosprovider = Screenprovider();

						if (chosprovider.equals("i")) {
							
							paying(service, voda, loging, data);
						}

						if (chosprovider.equals("ii")) {
							paying(service, ets, loging, data);

						}

						if (chosprovider.equals("iii")) {
							paying(service, orange, loging, data);

						}
						if (chosprovider.equals("iiii")) {
							paying(service, we, loging, data);

						}
						
					}
					else if (choice =='c') {
						System.out.println("enter the landline kind " );
						paying(service, we, loging, data);
						
					}
					


				}

				else {
					System.out.println("this user actually in use  ");
				}

			}
        
			System.out.println(" please enter 0 to log out 1 to login 2 to register another account" );
			
			a=in.nextInt();
			
		}

		
	}

	public static String ScreenService() {
		System.out.println("Choose service U need ");
		System.out.println(
				"a. Mobile recharge services.\n" + "b. Internet Payment services.\n" + "c. Landline services\n");
		Scanner in = new Scanner(System.in);
		String choice = in.next();

		return choice;

	}

	public static ArrayList<String> Input() {

		ArrayList<String> res = new ArrayList<String>();

		Scanner in1 = new Scanner(System.in);
		System.out.println("enter email: ");
		String em = in1.nextLine();
		res.add(em);

		System.out.println("enter pass: ");
		Scanner in2 = new Scanner(System.in);
		String pass = in2.nextLine();
		res.add(pass);

		return res;

	}

	public static String Screenprovider() {
		System.out.println("Choose your provider ");
		System.out.println("i. Vodafone\n" + "ii.Etisalat\n" + "iii. Orange\n");
		Scanner in = new Scanner(System.in);
		String choice = in.next();

		return choice;

	}

	public static void paying(Iservice service, company c, UserLogin l, ProviderDB data) {
		System.out.println("enter the amount you want to pay   ");
		Scanner in5 = new Scanner(System.in);
		double fee = in5.nextDouble();
		transaction t;
		t = new transaction(c, l.getCurrentuser(), fee);
		service.paying(t);

		data.addtansaction(t);

	}

	public static Online_Wallet creatingwallet() {
		System.out.println("please enter your wallet information :");

		Scanner in3 = new Scanner(System.in);
		System.out.println("enter wallet id: ");

		String wid = in3.nextLine();

		System.out.println("Balance : ");

		Scanner in4 = new Scanner(System.in);
		double balance = in4.nextDouble();

		return new Online_Wallet(wid, balance);

	}

}
