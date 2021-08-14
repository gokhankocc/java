package interitanceMiras;

public class Main {

	public static void main(String[] args) {
		
		Individualcustomer engin = new Individualcustomer();
		engin.customernumber="12345";
		
		Corporatecustomer hepsiBurada = new Corporatecustomer();
		hepsiBurada.customernumber="75412";
		
		SendikaCustomer abc = new SendikaCustomer();
		abc.customernumber ="23654";
		
		CustomerManager customermaneger = new CustomerManager();
		/*customermaneger.add(hepsiBurada);
		customermaneger.add(engin);
		customermaneger.add(abc);*/
		Customer[] customers = {engin, hepsiBurada, abc};
		
		customermaneger.addMultiple(customers);
		
	}

}
