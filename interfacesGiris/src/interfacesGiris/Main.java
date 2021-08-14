package interfacesGiris;

public class Main {

	public static void main(String[] args) {
		
		/*CustomerManager customerManager = new CustomerManager();
		customerManager.customerdal =new OracleCustomerDal();
		customerManager.add();*/ //bu yöntem genellikle unutuluyor 2. yöntem aþagýda constracter olarak yazýlabilir...
		
		CustomerManager customerManager = new CustomerManager(new OracleCustomerDal());
		customerManager.add();

	}

}
