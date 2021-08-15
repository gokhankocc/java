package arraylistWithClass;

import java.util.ArrayList;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<Customer> customers =new ArrayList<Customer>();
		Customer gökhan = new Customer(1,"gökhan","koç");
		customers.add(gökhan);
		Customer ali = new Customer(2,"ali","koç");
		customers.add(ali);
		Customer kadir = new Customer(3,"kadir","koç");
		customers.add(kadir);
		
		customers.remove(ali);
		for(Customer i:customers) {
			System.out.println(i.name);
		}

	}

}
