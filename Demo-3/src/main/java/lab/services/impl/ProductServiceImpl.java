package lab.services.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import lab.Entity.Product;
import lab.Repository.ProductRepository;
import lab.services.ProductServices;

public class ProductServiceImpl implements ProductServices{

	@Autowired
	private ProductRepository repo;
	
	@Override
	public void delete(Long id) {
		repo.deleteById(id);
		
	}

	@Override
	public Product get(Long id) {
		return repo.findById(id).get();
	}

	@Override
	public Product save(Product product) {
		// TODO Auto-generated method stub
		return repo.save(product);
	}

	@Override
	public List<Product> listAll() {
		// TODO Auto-generated method stub
		return repo.findAll();
	}
	

}
