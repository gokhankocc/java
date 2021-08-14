package kamp_5_nLayeredDemo;

import kamp_5_nLayeredDemo.business.abstracts.ProductService;
import kamp_5_nLayeredDemo.business.concretes.ProductManager;
import kamp_5_nLayeredDemo.core.JLoggerManagerAdapter;
import kamp_5_nLayeredDemo.core.LoggerService;
import kamp_5_nLayeredDemo.dataAccess.concretes.AbcProductDao;
import kamp_5_nLayeredDemo.dataAccess.concretes.HibernateProductDao;
import kamp_5_nLayeredDemo.entities.concretes.Product;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		   ProductService productService = new ProductManager(new AbcProductDao(),new JLoggerManagerAdapter());
			
			
		
		   
		   Product product = new Product(1,2,"elma",12,50);
		   productService.add(product);
		   
	        

	}

}
