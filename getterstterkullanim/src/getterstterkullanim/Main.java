package getterstterkullanim;

public class Main {

	public static void main(String[] args) {
		
		Product product1 = new Product(1,"lenovo v14",15000,"16 GB ram",10); //contructor
		
		
		Product product2 = new Product();
		product2.setId(1);
		product2.setName("lenovo v15");
		product2.setUnitPrice(16000);
		product2.setDetail("32 GB Ram");
		product2.setDiscount(10);
		
		System.out.println(product1.getUnitPriceAfterDiscount());
		System.out.println(product2.getUnitPriceAfterDiscount());
		
		
		Product[] products = {product1,product2};
		
		for(Product product:products) {
			System.out.println(product.getName());
		}
		
		Category category1 = new Category();
		category1.setId(1);
		category1.setName("Bilgisayar");
		
		Category category2 = new Category();
		category2.setId(2);
		category2.setName("yiyecek");
		
		System.out.println(category1.getId());
		System.out.println(category2.getName());

	}

}
