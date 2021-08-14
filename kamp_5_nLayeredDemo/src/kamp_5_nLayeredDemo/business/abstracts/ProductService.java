package kamp_5_nLayeredDemo.business.abstracts;

import java.util.List;

import kamp_5_nLayeredDemo.entities.concretes.Product;

public interface ProductService {
	void add(Product product);
	List<Product> getAll();

}
