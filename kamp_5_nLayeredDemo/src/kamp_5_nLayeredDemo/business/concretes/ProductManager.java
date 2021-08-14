package kamp_5_nLayeredDemo.business.concretes;

import java.util.List;

import kamp_5_nLayeredDemo.business.abstracts.ProductService;
import kamp_5_nLayeredDemo.core.LoggerService;
import kamp_5_nLayeredDemo.dataAccess.abstracts.ProductDao;
import kamp_5_nLayeredDemo.entities.concretes.Product;

public class ProductManager implements ProductService{
	
	private ProductDao dao;
	private LoggerService loggerservice;

	public ProductManager(ProductDao dao,LoggerService loggerservice) {
		super();
		this.dao = dao;
		this.loggerservice=loggerservice;
	}

	@Override
	public void add(Product product) {
		if(product.getCategoryId()==1) {
			System.out.println("bu kategoride ürün kabul edilmiyor");
			return;
		}
		this.dao.add(product);
		this.loggerservice.logToSystem("ürün eklendi :"+product.getName());
		
	}

	@Override
	public List<Product> getAll() {
		// TODO Auto-generated method stub
		return null;
	}

}
