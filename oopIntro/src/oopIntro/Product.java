package oopIntro;

public class Product {
	
	public Product() {                     //constracter
		System.out.println("ben calistim");
	}
	public Product(int id,String name,double unitprice,String detail) {  //contracter
		this.id=id;
		this.name=name;
		this.unitPrice=unitprice;
		this.detail=detail;
	}
	int id;
	String name;
	double unitPrice;
	String detail;

}
