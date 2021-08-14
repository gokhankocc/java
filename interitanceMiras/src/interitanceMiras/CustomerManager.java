package interitanceMiras;

public class CustomerManager {
	public void add(Customer customer) {
		
		System.out.println(customer.customernumber+" kaydedildi");
	}
	
	public void addMultiple(Customer[] customers) {
		
		for(Customer customer:customers) {
			add(customer);
		}
	}

}
