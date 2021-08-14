package classeswithattirubites;

public class Main {

	public static void main(String[] args) {
		Product product = new Product();
		product.setId(1); 
		product.setName("laptop");
		product.setPrice(5000);
		product.setStocckAmount(3);
		product.setDescription("asus");
		
		ProductManager productManager= new ProductManager();
		productManager.Add(product);
		
       System.out.println(product.getKod());
	}
	
}
