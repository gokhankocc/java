package oopIntro;

public class Main {
	public static void main(String[] args) {
	
		Product product1 = new Product(1,"lenovo v14",15000,"16 GB ram"); //referans olusturma,intance
		/*product1.id =1;
		product1.name="lenovo v14";
		product1.unitPrice = 15000;
		product1.detail ="16 GB Ram";*/
		
		Product product2 = new Product(); //referans olusturma,intance
		product2.id =1;
		product2.name="lenovo v15";
		product2.unitPrice = 16000;
		product2.detail ="32 GB Ram";
		
		Product product3 = new Product(); //referans olusturma,intance
		product3.id =1;
		product3.name="hp 5";
		product3.unitPrice = 10000;
		product3.detail ="8 GB Ram";
		
		
		Product[] products = {product1,product2,product3};
		
		for (Product product : products) {
			System.out.println(product.name);
		}
		
		System.out.println(products.length);
		
		Category category1 = new Category();
		category1.id= 1;
		category1.name="Bilgisayar";
		
		Category category2 = new Category();
		category2.id= 1;
		category2.name="Ev/Bahce";
		
		
		ProductManager productmanager = new ProductManager();
		productmanager.addToCart(product1);
		productmanager.addToCart(product2);
		productmanager.addToCart(product3);
		
		
	}

}
