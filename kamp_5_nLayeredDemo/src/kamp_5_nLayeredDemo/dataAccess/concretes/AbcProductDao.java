package kamp_5_nLayeredDemo.dataAccess.concretes;

import java.util.List;

import kamp_5_nLayeredDemo.dataAccess.abstracts.ProductDao;
import kamp_5_nLayeredDemo.entities.concretes.Product;

public class AbcProductDao implements ProductDao{

	@Override
	public void add(Product product) {
		// TODO Auto-generated method stub
		System.out.println("abc product with to add :"+ product.getName());
		
	}

	@Override
	public void update(Product product) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void delete(Product product) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public Product get(int id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Product> getAll() {
		// TODO Auto-generated method stub
		return null;
	}

}
