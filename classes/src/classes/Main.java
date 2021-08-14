package classes;

public class Main {

	public static void main(String[] args) {
		CustomerManager customerMenager;// = new CustomerManager();
		CustomerManager customerMenager2 = new CustomerManager();
		customerMenager=customerMenager2; //6. satırdaki new in bi anlamı kalmaz newsizde calişabilir
		customerMenager.add();
		customerMenager.update();
		customerMenager.remove();
	}

}
